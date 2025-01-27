import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int j = 1;
        StringBuilder ans = new StringBuilder();
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(tokens.nextToken()),
                m = Integer.parseInt(tokens.nextToken()),
                c = Integer.parseInt(tokens.nextToken());

            if(n == 0 && m == 0 && c == 0) break;

            int[] ci = new int[n];
            int[] state = new int[n];
            int currentC = 0, maxC = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                ci[i] = Integer.parseInt(in.readLine());
            }

            int k;
            for(int i = 0; i < m; i++){
                k = Integer.parseInt(in.readLine()) - 1;
                state[k]++;
                if(state[k] % 2 != 0) currentC += ci[k];
                else currentC -= ci[k];

                maxC = Math.max(maxC, currentC);
                if(currentC > c){
                    i++;
                    while(i<m) {
                        in.readLine();
                        i++;
                    }
                    break;
                }
            }

            if(currentC <= c){
                ans.append("Sequence ").append(j).append("\nFuse was not blown.\n");
                ans.append("Maximal power consumption was ").append(maxC).append(" amperes.\n\n");
            }else{
                ans.append("Sequence ").append(j).append("\nFuse was blown.\n\n");
            }
            j++;
        }
        out.print(ans);

        out.close();
    }
}
