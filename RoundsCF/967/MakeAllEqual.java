import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static void solve() throws Exception {
        int n = Integer.parseInt(in.readLine()),
            max = Integer.MIN_VALUE;
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int[] a = new int[n];
        while(tokens.hasMoreTokens()){
            a[Integer.parseInt(tokens.nextToken()) - 1]++;
        }

        for(int each : a){
            max = Math.max(max, each);
        }

        out.println(n - max);
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
