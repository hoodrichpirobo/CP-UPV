import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static int solve() throws Exception{
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(tokens.nextToken()),
            K = Integer.parseInt(tokens.nextToken()),
            P = Integer.parseInt(tokens.nextToken());

//      return (K+P)%N == 0 ? N : (K+P)%N;
        return (K+P-1)%N+1;        
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        int c = 0;
        while(TC-->0){
            out.printf("Case %d: %d\n",++c, solve());
        }

        out.close();
    }
}
