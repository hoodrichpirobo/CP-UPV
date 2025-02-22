import java.io.*;
import java.util.*;

public class Main{
    public static String[] mergeSort(String[] hand, Map<Integer, Integer> map){
        if(hand.length <= 1) return hand;
        int mid = hand.length / 2;
        String[] left = Arrays.copyOfRange(hand, 0, mid);
        String[] right = Arrays.copyOfRange(hand, mid, hand.length);
        left = mergeSort(left, map);
        right = mergeSort(right, map);
        return merge(left, right, map);
    }

    private static String[] merge(String[] left, String[] right, Map<Integer, Integer> map){
        String[] merged = new String[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(compareCards(left[i], right[j], map) <= 0){
                merged[k++] = left[i++];
            }else{
                merged[k++] = right[j++];
            }
        }

        while(i < left.length){
            merged[k++] = left[i++];
        }
        while(j < right.length){
            merged[k++] = right[j++];
        }

        return merged;
    }

    private static int compareCards(String a, String b, Map<Integer, Integer> map){
        int valA = getValue(a.charAt(0)),
            valB = getValue(b.charAt(0)),
            freqA = map.get(valA),
            freqB = map.get(valB);
        if(freqA != freqB){
            return freqA - freqB;
        }
        return valA - valB;
    }

    public static int getValue(char c){
        if(c == 'T') return 10;
        if(c == 'J') return 11;
        if(c == 'Q') return 12;
        if(c == 'K') return 13;
        if(c == 'A') return 14;
        
        return (c - '0');
    }

    public static int assignRank(String[] hand, Map<Integer, Integer> map){
        boolean four = false, flush = true, straight = true, three = false, two = false, pair = false;
        int pairs = 0;
        int[] values = new int[5];
        int x = 0;
        for(int each : map.keySet()){
            int value = map.get(each);
            if(value == 4) four = true;
            if(value == 3) three = true;
            if(value == 2){
                pair = true;
                pairs++;
            }
            if(pairs >= 2) two = true;
            for(int i = 0; i < value; i++){
                values[x] = each;
                x++;
            }
        }

        Arrays.sort(values);
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < 5; i++){
            set.add(hand[i].charAt(1));
            if(i < 4 && values[i] + 1 != values[i + 1]) straight = false;
        }

        if(set.size() != 1) flush = false;

        if(straight && flush) return 9;
        if(four) return 8;
        if(three && pair) return 7;
        if(flush) return 6;
        if(straight) return 5;
        if(three) return 4;
        if(two) return 3;
        if(pair) return 2;
        return 1;
    }

    public static String compare(String[] black, String[] white, Map<Integer, Integer> map1, Map<Integer, Integer> map2){
        black = mergeSort(black, map1);
        white = mergeSort(white, map2);

        int valBlack, valWhite;
        for(int i = 4; i >= 0; i--){
            valBlack = getValue(black[i].charAt(0));
            valWhite = getValue(white[i].charAt(0));
            if(valBlack > valWhite) return "Black wins.";
            else if(valBlack < valWhite) return "White wins.";
        }
        return "Tie.";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        StringBuilder ans = new StringBuilder();
        while((line = in.readLine()) != null && !line.isEmpty()){
            String[] black = new String[5];
            String[] white = new String[5];

            StringTokenizer tokens = new StringTokenizer(line);
            for(int i = 0; i < 10; i++){
                if(i < 5) black[i] = tokens.nextToken();
                else white[i%5] = tokens.nextToken();
            }

            int value;
            Map<Integer, Integer> mapBlack = new HashMap<>();
            for(int i = 0; i < 5; i++){
                value = getValue(black[i].charAt(0));
                mapBlack.put(value, mapBlack.getOrDefault(value, 0) + 1);
            }

            Map<Integer, Integer> mapWhite = new HashMap<>();
            for(int i = 0; i < 5; i++){
                value = getValue(white[i].charAt(0));
                mapWhite.put(value, mapWhite.getOrDefault(value, 0) + 1);
            }

            Map<String, Integer> rank = new HashMap<>();
            rank.put("black", assignRank(black, mapBlack));
            rank.put("white", assignRank(white, mapWhite));

            if(rank.get("black") > rank.get("white")) ans.append("Black wins.");
            else if(rank.get("black") < rank.get("white")) ans.append("White wins.");
            else ans.append(compare(black, white, mapBlack, mapWhite));

            ans.append('\n');
        }
        out.print(ans);

        out.close();
    }
}
