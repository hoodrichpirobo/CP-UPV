import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int c = 0;

        while (true) {
            String line = in.readLine();
            
            if (line.equals("0 0")) {
                break;
            }

            StringTokenizer tokens = new StringTokenizer(line);
            int R = Integer.parseInt(tokens.nextToken());
            int N = Integer.parseInt(tokens.nextToken());

            // Math.ceil((double)(R-N)/N)
            int result = (R - N + N - 1) / N;

            String ans;
            if (result <= 26) {
                ans = " " + result;
            } else {
                ans = " impossible";
            }

            out.printf("Case %d:%s\n", ++c, ans);
        }

        out.close();
    }
}
