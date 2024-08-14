import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static int solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            max = Integer.MIN_VALUE;
        
        while(n-->0){
            max = Math.max(max, Integer.parseInt(tokens.nextToken()));
        }

        return max;
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine()),
            c = 0;
        while(TC-->0){
            out.printf("Case %d: %d\n", ++c, solve());
        }

        out.close();
    }
}
