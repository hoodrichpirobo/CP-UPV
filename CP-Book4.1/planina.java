import java.util.*;
import java.io.*;

public class planina{
    static BufferedReader in;
    static PrintWriter out;
    
    static void solve(int N){
        // It 0 : 2x2
        // It 1 : 3x3
        // It 2 : 5x5
        // It i : 2^{i}+1x2^{i}+1
        out.println((int) Math.pow( Math.pow(2, N) + 1, 2));
    }
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        int N = Integer.parseInt(in.readLine());
        solve(N);
        
        out.close();
    }
}
