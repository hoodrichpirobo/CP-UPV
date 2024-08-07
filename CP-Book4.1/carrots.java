import java.util.*;
import java.io.*;

public class carrots{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        tokens.nextToken();
        out.println(tokens.nextToken());
        
        out.close();
    }
}
