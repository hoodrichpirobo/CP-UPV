import java.io.*;
import java.util.*;

public class Main{
    public static List<String> mergeSort(List<String> l){
        if(l.size() <= 1) return l;

        int mid = l.size()/2;
        List<String> ll = mergeSort(new ArrayList<>(l.subList(0, mid)));
        List<String> lr = mergeSort(new ArrayList<>(l.subList(mid, l.size())));
        return merge(ll, lr);
    }

    private static List<String> merge(List<String> ll, List<String> lr){
        List<String> merged = new ArrayList<>();

        int i = 0, j = 0;
        while(i < ll.size() && j < lr.size()){
            if(compareCards(ll.get(i), lr.get(j)) <= 0){
                merged.add(ll.get(i));
                i++;
            }else{
                merged.add(lr.get(j));
                j++;
            }
        }

        while(i < ll.size()){
            merged.add(ll.get(i));
            i++;
        }

        while(j < lr.size()){
            merged.add(lr.get(j));
            j++;
        }

        return merged;
    }

    private static int compareCards(String c1, String c2){
        String suitOrder = "CDSH";
        String rankOrder = "23456789TJQKA";

        char suit1 = c1.charAt(0),
             suit2 = c2.charAt(0);

        if(suit1 != suit2){
            return suitOrder.indexOf(suit1) - suitOrder.indexOf(suit2);
        }

        char rank1 = c1.charAt(1),
             rank2 = c2.charAt(1);

        return rankOrder.indexOf(rank1) - rankOrder.indexOf(rank2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            char dealer = in.readLine().charAt(0);

            if(dealer == '#') break;

            Map<Character, Integer> map = new HashMap<>();
            map.put('S', 0);
            map.put('W', 1);
            map.put('N', 2);
            map.put('E', 3);
       
            char[] arr = in.readLine().toCharArray();
            List<String> l0 = new ArrayList<>();
            List<String> l1 = new ArrayList<>();
            List<String> l2 = new ArrayList<>();
            List<String> l3 = new ArrayList<>();
            int j = map.get(dealer);
            for(int i = 0; i < arr.length - 1; i += 2){
                j = (j + 1)%4;

                if(j == 0) l0.add(("" + arr[i] + arr[i + 1]));
                if(j == 1) l1.add(("" + arr[i] + arr[i + 1]));
                if(j == 2) l2.add(("" + arr[i] + arr[i + 1]));
                if(j == 3) l3.add(("" + arr[i] + arr[i + 1]));
            }
            arr = in.readLine().toCharArray();
            for(int i = 0; i < arr.length - 1; i += 2){
                j = (j + 1)%4;

                if(j == 0) l0.add(("" + arr[i] + arr[i + 1]));
                if(j == 1) l1.add(("" + arr[i] + arr[i + 1]));
                if(j == 2) l2.add(("" + arr[i] + arr[i + 1]));
                if(j == 3) l3.add(("" + arr[i] + arr[i + 1]));
            }

            l0 = mergeSort(l0);
            l1 = mergeSort(l1);
            l2 = mergeSort(l2);
            l3 = mergeSort(l3);

            ans.append("S:");
            for(String each : l0){
                ans.append(" ").append(each);
            }
            ans.append("\nW:");
            for(String each : l1){
                ans.append(" ").append(each);
            }
            ans.append("\nN:");
            for(String each : l2){
                ans.append(" ").append(each);
            }
            ans.append("\nE:");
            for(String each : l3){
                ans.append(" ").append(each);
            }
            ans.append("\n");
        }
        out.print(ans);

        out.close();
    }
}
