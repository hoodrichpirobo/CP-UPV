import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static String solve() throws Exception {
        int n = Integer.parseInt(in.readLine()),
            h = 0, l = 0;
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int prev = Integer.parseInt(tokens.nextToken()),
            a = prev;

        while(n-->0){
            if(prev < a){
                h++;
            }else if(prev > a){
                l++;
            }
            prev = a;
            if(tokens.hasMoreTokens()){
                a = Integer.parseInt(tokens.nextToken());
            }
        }

        return h + " " + l;
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine()),
            c = 0;
        while(TC-->0){
            out.printf("Case %d: %s\n", ++c, solve());
        }

        out.close();
    }
}
