import java.util.*;
import java.io.*;

public class Solution{
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            h = Integer.parseInt(tokens.nextToken());
        
        tokens = new StringTokenizer(in.readLine());
        int totalWidth = 0;

        for(int i = 0; i < n; ++i){
            if(Integer.parseInt(tokens.nextToken()) > h){
                totalWidth += 2;
            }else{
                totalWidth++;
            }
        }

        out.println(totalWidth);    
        out.close();
    }
}
