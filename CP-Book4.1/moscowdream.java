import java.util.*;
import java.io.*;

public class moscowdream{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(tokens.nextToken()), b = Integer.parseInt(tokens.nextToken()),
            c = Integer.parseInt(tokens.nextToken()), n = Integer.parseInt(tokens.nextToken());
        if((a > 0) && (b > 0) && (c > 0) && (a+b+c >= n) && (n >= 3)){
            out.println("YES");
        }else{
            out.println("NO");
        }
        
        out.close();
    }
}
