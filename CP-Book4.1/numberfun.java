import java.util.*;
import java.io.*;

public class numberfun{
    static BufferedReader in;
    static PrintWriter out;
    
    static String solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(tokens.nextToken()),
            b = Integer.parseInt(tokens.nextToken()),
            c = Integer.parseInt(tokens.nextToken());
        
        if((a + b) == c){
            return "Possible";
        }
        
        if(((a - b) == c) || ((b - a) == c)){
            return "Possible";
        }
        
        if((a * b) == c){
            return "Possible";
        }
       
        if(((b * c) == a) || ((a * c) == b)){ 
            return "Possible";
        }
        
        return "Impossible";
    }
    
    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        int TC = Integer.parseInt(in.readLine());
        while(TC-->0){
            out.println(solve());
        }
        
        out.close();
    }
}
