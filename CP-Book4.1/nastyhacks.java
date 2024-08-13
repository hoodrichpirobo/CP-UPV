import java.util.*;
import java.io.*;

public class nastyhacks{
    static BufferedReader in;
    static PrintWriter out;
    
    static void solve() throws Exception{
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int r = Integer.parseInt(tokens.nextToken()),
            e = Integer.parseInt(tokens.nextToken()),
            c = Integer.parseInt(tokens.nextToken());
        if(r < (e - c)){
            out.println("advertise");
        }else if(r > (e - c)){
            out.println("do not advertise");
        }else if(r == (e - c)){
            out.println("does not matter");
        }
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
