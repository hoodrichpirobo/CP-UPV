import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static void solve() throws Exception{
        long n = Long.parseLong(in.readLine());

        // k rows
        // Sum of i to k -> (k(k+1))/2 - (i(i-1))/2
        // Sum = 1 + 2 + 3 + ... + k = (k(k+1))/2
        // (k(k+1))/2 <= n
        // k^2+k-2n <= 0
        // k = (-1 + Math.sqrt(1+8n))/2
        
        long k = (- 1 + (long) Math.sqrt(1+(8*n)))/2;
        out.println(k);
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        while(TC-->0){
            solve();
        }

        out.close();
    }
}
