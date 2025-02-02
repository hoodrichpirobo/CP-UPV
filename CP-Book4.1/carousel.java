import java.io.*;
import java.util.*;

public class carousel{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(tokens.nextToken()),
                m = Integer.parseInt(tokens.nextToken());

            if(n == 0 && m == 0){
                break;
            }

            double minDiv = Integer.MAX_VALUE, div;
            int minA = -1, minB = -1, a, b;
            while(n-->0){
                tokens = new StringTokenizer(in.readLine());
                a = Integer.parseInt(tokens.nextToken());
                b = Integer.parseInt(tokens.nextToken());
                if(a <= m){
                    div = 1.0*b/a;
                    if(minDiv > div){
                        minDiv = div;
                        minA = a;
                        minB = b;
                    }else if(minDiv == div && a > minA){
                        minA = a;
                        minB = b;
                    }
                }
            }

            if(minA == -1) ans.append("No suitable tickets offered\n");
            else ans.append("Buy ").append(minA).append(" tickets for $").append(minB).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
