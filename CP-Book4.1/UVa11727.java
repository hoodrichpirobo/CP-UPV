import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static int solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        
        int[] xyz = new int[3];
        for(int i = 0; i < xyz.length; ++i){
            xyz[i] = Integer.parseInt(tokens.nextToken());
        }
        Arrays.sort(xyz);

        return xyz[1];
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        int c = 0;
        while(TC-->0){
            out.printf("Case %d: %d\n", ++c, solve());
        }

        out.close();
    }
}
