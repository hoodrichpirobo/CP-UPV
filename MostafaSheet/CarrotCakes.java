import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            t = Integer.parseInt(tokens.nextToken()),
            k = Integer.parseInt(tokens.nextToken()),
            d = Integer.parseInt(tokens.nextToken()),
            ovenA = (int) Math.ceil((double)n/k)*t,
            cake = 0;

        int ovenB;
        for(ovenB = (d + t); cake < n; ovenB += t){
            cake += ((d+t)/t * k) + k;
        }

        ovenB -= t;

        if(ovenB < ovenA){
            out.println("YES");
        }else{
            out.println("NO");
        }

        out.close();
    }
}
