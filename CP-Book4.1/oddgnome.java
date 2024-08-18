import java.util.*;
import java.io.*;

public class oddgnome{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int n = Integer.parseInt(in.readLine());
        while(n-->0){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int s = Integer.parseInt(tokens.nextToken()),
                g = 0, prev = 0;
            for(int i = 0; i < s - 1; i++){
                g = Integer.parseInt(tokens.nextToken());
                if(g != (prev + 1) && i > 0){
                    out.println(i + 1);
                    break;
                }
                prev = g;
            }
        }
        
        out.close();
    }
}
