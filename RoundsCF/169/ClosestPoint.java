import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader in;
    static PrintWriter out;

    static boolean solve() throws Exception {
        in.readLine();
        String line = in.readLine().trim();
        StringTokenizer tokens = new StringTokenizer(line);
        
        if (tokens.countTokens() != 2) {
            return false; 
        }
        
        int a = Integer.parseInt(tokens.nextToken()),
            b = Integer.parseInt(tokens.nextToken());

        return Math.abs(a - b) > 1;
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine().trim());
        while (TC-- > 0) {
            if (solve()) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }

        out.close();
    }
}

