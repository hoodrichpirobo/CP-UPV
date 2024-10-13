import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line, ans;
        StringTokenizer tokens;
        while (true) {
            line = in.readLine().trim();
            if (line.equals("0 0")) {
                break;
            }

            tokens = new StringTokenizer(line);
            int B = Integer.parseInt(tokens.nextToken()),
                N = Integer.parseInt(tokens.nextToken());

            tokens = new StringTokenizer(in.readLine());
            int[] reserve = new int[B];
            for (int i = 0; i < B; i++) {
                reserve[i] = Integer.parseInt(tokens.nextToken());
            }

            ans = "S";
            for (int i = 0; i < N; i++) {
                line = in.readLine().trim();
                tokens = new StringTokenizer(line);
                int from = Integer.parseInt(tokens.nextToken()) - 1,
                    to   = Integer.parseInt(tokens.nextToken()) - 1,
                    trans= Integer.parseInt(tokens.nextToken());

                reserve[from] -= trans;
                reserve[to]   += trans;
            }

            for(int i = 0; i < B; i++){
              if(reserve[i] < 0){
                ans = "N";
                break;
              }
            }

            out.println(ans);
        }
        out.close();
    }
}

