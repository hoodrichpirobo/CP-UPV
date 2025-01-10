import java.io.*;
import java.util.*;

public class climbingstairs{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            r = Integer.parseInt(tokens.nextToken()),
            k = Integer.parseInt(tokens.nextToken()),
            ans = k + Math.abs(k-r);
        ans = Math.max(ans, Math.abs(n - ans) % 2 == 0 ? n : n + 1);
        ans += r;

        out.println(ans);

        out.close();
    }
}
