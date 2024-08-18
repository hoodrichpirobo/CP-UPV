import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static void solve() throws Exception {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        in.readLine();
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        while(tokens.hasMoreTokens()){
            int x = Integer.parseInt(tokens.nextToken());
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        out.println((max-min)*2);
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        while(TC-->0){
            solve();
        }

        out.close();
    }
}
