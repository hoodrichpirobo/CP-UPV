import java.util.*;
import java.io.*;

public class timeloop{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        int N = Integer.parseInt(in.readLine());
        for(int i = 1; i <= N; ++i){
            out.printf("%d Abracadabra\n", i);
        }
        
        out.close();
    }
}
