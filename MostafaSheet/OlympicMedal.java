import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            x = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            x = Math.max(Integer.parseInt(tokens.nextToken()), x);
        }

        tokens = new StringTokenizer(in.readLine());
        int m = Integer.parseInt(tokens.nextToken()),
            y = Integer.MIN_VALUE;
        for(int i = 0; i < m; i++){
            y = Math.max(Integer.parseInt(tokens.nextToken()), y);
        }

        tokens = new StringTokenizer(in.readLine());
        int k = Integer.parseInt(tokens.nextToken()),
            z = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++){
            z = Math.min(Integer.parseInt(tokens.nextToken()), z);
        }

        tokens = new StringTokenizer(in.readLine());
        int A = Integer.parseInt(tokens.nextToken()),
            B = Integer.parseInt(tokens.nextToken());

        // (M_out/M_in) = (A/B)
        // (PI * thikknes * p_1 ((d_1/2)^2 - (d_2/2)^2))/(PI * thikkness * p_2 ((d_2/2)^2 - (0/2)^2)) = (A/B)
        // (p_1 ((d_1/2)^2 - (d_2/2)^2))/(p_2(d_2/2)^2) = (A/B)
        // (p_1 ((2r_1/2)^2 - (2r_2/2)^2))/(p_2(2r_2/2)^2)) = (A/B)
        // (p_1 (r_1^2 - r_2^2))/(p_2 (r_2^2)) = (A/B)
        // (p_1 * r_1^2 * B) - (p_1 * r_2^2 * B) = (p_2 * r_2^2 * A) 
        // r_2^2 (p_1 * B + p_2 * A) = (p_1 * r_1^2 * B)
        // r_2^2 = (p_1 * r_1^2 * B)/(p_1*B + p_2*A)
        // r_2 = r_1 * Sqrt(p_1*B / p_1*B + p_2*A)

        double ans = (double)x * Math.sqrt(((double)y*B)/((y*B) + (z*A)));
        out.println(ans);

        out.close();
    }
}
