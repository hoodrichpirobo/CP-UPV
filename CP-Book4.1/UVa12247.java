import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int[] princess = new int[3];
            int[] prince = new int[2];
            for(int i = 0; i < 3; i++){
                princess[i] = Integer.parseInt(tokens.nextToken());
            }
            for(int i = 0; i < 2; i++){
                prince[i] = Integer.parseInt(tokens.nextToken());
            }

            if(princess[0] == 0) break;

            Arrays.sort(princess);
            Arrays.sort(prince);

            boolean[] used = new boolean[53];
            for(int i = 0; i < 3; i++){
                used[princess[i]] = true;
            }
            for(int i = 0; i < 2; i++){
                used[prince[i]] = true;
            }

            int card = -1;
            for(int i = 1; i <= 52; i++){
                if(used[i]) continue;

                int[] r = {prince[0], prince[1], i};
                Arrays.sort(r);

                int wins = 0, j = 0;
                for(int k = 0; k < 3; k++){
                    while(j < 3 && princess[j] <= r[k]){
                        j++;
                    }
                    if(j < 3){
                        wins++;
                        j++;
                    }
                }

                if(wins < 2){
                    card = i;
                    break;
                }
            }

            ans.append(card).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
