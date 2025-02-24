import java.io.*;
import java.util.*;

public class Main{
    public static int[] sumAll(int[] hand, boolean[] visited){
        int swap = hand[1];
        while(swap < 13 && visited[swap]){
            swap++;
        }

        hand[0] = swap;
        hand[1] = swap;
        hand[2] = swap;

        return hand;
    }

    public static int[] sumOne(int[] hand, boolean[] visited, int one){
        int swap = hand[one];
        if(swap >= 13){
            swap = hand[(one + 1)%3];
            while(swap < 13 && visited[swap]){
                swap++;
            }

            hand[one] = 1;
            hand[(one + 1)%3] = swap;
            hand[(one + 2)%3] = swap;
        }else{
            while(swap < 13 && visited[swap]){
                swap++;
            }

            if(visited[swap]){
                hand[0] = 1;
                hand[1] = 1;
                hand[2] = 1;
            }else{
                hand[one] = swap;
            }
        }

        return hand;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int[] hand = new int[3];
            boolean[] visited = new boolean[14];
            for(int i = 0; i < 3; i++){
                hand[i] = Integer.parseInt(tokens.nextToken());
                visited[hand[i]] = true;
            }
            
            if(visited[0]) break;

            Arrays.sort(hand);
            if(hand[0] == 13 && hand[1] == 13 && hand[2] == 13){
                ans.append("*\n");
                continue;
            }
            if(hand[0] == hand[1] && hand[1] == hand[2]){
                hand = sumAll(hand, visited);
            }else if(hand[0] == hand[1]){
                hand = sumOne(hand, visited, 2);
            }else if(hand[2] == hand[1]){
                hand = sumOne(hand, visited, 0);
            }else{
                hand[0] = 1;
                hand[1] = 1;
                hand[2] = 2;
            }

            Arrays.sort(hand);
            ans.append(hand[0]).append(" ").append(hand[1]).append(" ").append(hand[2]);
            ans.append('\n');
        }
        out.print(ans);

        out.close();
    }
}
