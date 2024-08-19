import java.util.*;
import java.io.*;

public class speedlimit{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        while(true){
            int n = Integer.parseInt(in.readLine());
            if(n == -1){
                break;
            }
            
            int prev = 0, d = 0;
            for(int i = 0; i < n; i++){
                StringTokenizer tokens = new StringTokenizer(in.readLine());
                int s = Integer.parseInt(tokens.nextToken()),
                    t = Integer.parseInt(tokens.nextToken());
                d += s*(t-prev);
                prev = t;
            }
            out.println(d + " miles");
        }
        
        out.close();
    }
}
