import java.io.*;
import java.util.*;

public class judgingmoose{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int l = Integer.parseInt(tokens.nextToken()),
            r = Integer.parseInt(tokens.nextToken());
        if((l == r) && (l !=0)){
            out.println("Even " + l*2);
        }else if((l == r) && (l == 0)){
            out.println("Not a moose");
        }else{
            out.println("Odd " + (int)Math.max(l,r)*2);
        }
        
        out.close();
    }
}
