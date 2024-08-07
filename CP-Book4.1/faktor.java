import java.util.*;
import java.io.*;

public class faktor{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int A = Integer.parseInt(tokens.nextToken()),
            I = Integer.parseInt(tokens.nextToken());
        out.println(A*(I-1)+1);
            
        out.close();
    }
}
