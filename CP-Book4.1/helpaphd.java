import java.io.*;
import java.util.*;

public class helpaphd{
    static BufferedReader in;
    static PrintWriter out;
    
    static void solve() throws Exception{
        String line = in.readLine();
        if(line.equals("P=NP")){
            out.println("skipped");
        }else{
            StringTokenizer tokens = new StringTokenizer(line, "+");
            out.println(Integer.parseInt(tokens.nextToken()) 
                    + Integer.parseInt(tokens.nextToken()));
        }
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
