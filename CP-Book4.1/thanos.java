import java.util.*;
import java.io.*;

public class thanos{
    static BufferedReader in;
    static PrintWriter out;
    
    static void solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        long P = Long.parseLong(tokens.nextToken()),
             R = Long.parseLong(tokens.nextToken()),
             F = Long.parseLong(tokens.nextToken());
    
        int i = 0;
        while(P <= F){
            P *= R;
            i++;
        }

        out.println(i);
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
