import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int c = 0;
        while(true){
            int n = Integer.parseInt(in.readLine().trim());
            if(n == 0){
                break;
            }

            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int r = 0, g = 0;
            while(n-->0){
                int a = Integer.parseInt(tokens.nextToken());
                if(a > 0){
                    r++;
                }else if(a == 0){
                    g++;
                }
            }
            out.printf("Case %d: %d\n", ++c, (r - g));
        }

        out.close();
    }
}
