import java.io.*;
import java.util.*;

public class Main{
    public static int getVal(char c){
        if(c == 'A') return 4;
        if(c == 'K') return 3;
        if(c == 'Q') return 2;
        if(c == 'J') return 1;
        return 0;
    }

    public static boolean substract(List<String> list, char c, int size){
        return list.stream().anyMatch(s -> s.matches("^" + c + ".*")) && list.size() <= size;
    }

    public static boolean stopped(List<String> list1, List<String> list2, List<String> list3, List<String> list4){
        if(!list1.stream().anyMatch(s -> (s.matches("^A.*")) || (s.matches("^K.*") && list1.size() >= 2) ||
            (s.matches("^Q.*") && list1.size() >= 3))) return false;
        if(!list2.stream().anyMatch(s -> (s.matches("^A.*")) || (s.matches("^K.*") && list2.size() >= 2) ||
            (s.matches("^Q.*") && list2.size() >= 3))) return false;
        if(!list3.stream().anyMatch(s -> (s.matches("^A.*")) || (s.matches("^K.*") && list3.size() >= 2) ||
            (s.matches("^Q.*") && list3.size() >= 3))) return false;
        if(!list4.stream().anyMatch(s -> (s.matches("^A.*")) || (s.matches("^K.*") && list4.size() >= 2) ||
            (s.matches("^Q.*") && list4.size() >= 3))) return false;
        return true;
    }

    public static int add(List<String> l1, List<String> l2, List<String> l3, List<String> l4, int contains, int points){
        int ret = 0;

        if(l1.size() == contains) ret += points;
        if(l2.size() == contains) ret += points;
        if(l3.size() == contains) ret += points;
        if(l4.size() == contains) ret += points;

        return ret;
    }

    public static char selectSuit(List<String> S, List<String> H, List<String> D, List<String> C){
        if(S.size() >= H.size() && S.size() >= D.size() && S.size() >= C.size()) return 'S';
        if(H.size() >= S.size() && H.size() >= D.size() && H.size() >= C.size()) return 'H';
        if(D.size() >= S.size() && D.size() >= H.size() && D.size() >= C.size()) return 'D';
        else return 'C';
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        while((line = in.readLine()) != null && !line.isEmpty()){
            StringTokenizer tokens = new StringTokenizer(line);
            List<String> S = new ArrayList<>();
            List<String> H = new ArrayList<>();
            List<String> D = new ArrayList<>();
            List<String> C = new ArrayList<>();

            int points = 0;
            for(int i = 0; i < 13; i++){
                line = tokens.nextToken();
                points += getVal(line.charAt(0));
                switch(line.charAt(1)){
                    case 'S':
                        S.add(line);
                        break;
                    case 'H':
                        H.add(line);
                        break;
                    case 'D':
                        D.add(line);
                        break;
                    case 'C':
                        C.add(line);
                        break;
                }
            }

            if(substract(S, 'K', 1)) points--;
            if(substract(H, 'K', 1)) points--;
            if(substract(D, 'K', 1)) points--;
            if(substract(C, 'K', 1)) points--;
            
            if(substract(S, 'Q', 2)) points--;
            if(substract(H, 'Q', 2)) points--;
            if(substract(D, 'Q', 2)) points--;
            if(substract(C, 'Q', 2)) points--;

            if(substract(S, 'J', 3)) points--;
            if(substract(H, 'J', 3)) points--;
            if(substract(D, 'J', 3)) points--;
            if(substract(C, 'J', 3)) points--;

            if(points >= 16 && stopped(S, H, D, C)){
                out.println("BID NO-TRUMP");
            } else {
                points += add(S, H, D, C, 2, 1);
                points += add(S, H, D, C, 1, 2);
                points += add(S, H, D, C, 0, 2);

                char suit = selectSuit(S, H, D, C);

                if(points >= 14) out.println("BID " + suit);
                else out.println("PASS");
            }
        }

        out.close();
    }
}
