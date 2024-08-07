import java.util.*;
import java.io.*;

public class r2{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        // S = (R_{1} + R_{2})/2
        // 2S-R_{1}=R_{2}
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int R1 = Integer.parseInt(tokens.nextToken()),
            S = Integer.parseInt(tokens.nextToken());
        out.println(2*S - R1);
        
        out.close();
    }
}

