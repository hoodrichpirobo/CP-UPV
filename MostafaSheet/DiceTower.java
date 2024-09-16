import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        Map<Integer, Integer> idealDice = new HashMap<>();
        for(int i = 1; i <= 6; i++){
            idealDice.put(i, 7 - i);
        }

        int n = Integer.parseInt(in.readLine());
        int x = Integer.parseInt(in.readLine());
        StringTokenizer tokens = new StringTokenizer(in.readLine());    //just need the top (x) from 
        int a = Integer.parseInt(tokens.nextToken()),                   //the first dice tho
            b = Integer.parseInt(tokens.nextToken());
        boolean ans = true;

        if(n > 1){
            while(n-->1){                                               //we crossing possibilities
                boolean[] couldBeTop = {true, true, true, true, true, true, true};
                tokens = new StringTokenizer(in.readLine());
                a = Integer.parseInt(tokens.nextToken());
                b = Integer.parseInt(tokens.nextToken());

                couldBeTop[a] = false;
                couldBeTop[b] = false;
                couldBeTop[idealDice.get(a)] = false;
                couldBeTop[idealDice.get(b)] = false;
                couldBeTop[idealDice.get(x)] = false;               //adjacent dice contact with 
                                                                    //faces with distinct numbers
                int possibleTops = 0;
                int lastPossibleTop = 0;

                for(int i = 1; i <= 6; i++){
                    if(couldBeTop[i]){
                        possibleTops++;
                        lastPossibleTop = i;
                    }
                }

                if(possibleTops > 1){                           //has more than one possible top?
                    ans = false;
                    break;
                }else{
                    x = lastPossibleTop;
                }
            }
        }

        if(ans){
            out.println("YES");
        }else{
            out.println("NO");
        }

        out.close();
    }
}
