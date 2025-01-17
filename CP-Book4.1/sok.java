import java.io.*;
import java.util.*;

public class sok{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        double a = Integer.parseInt(tokens.nextToken()),
               b = Integer.parseInt(tokens.nextToken()),
               c = Integer.parseInt(tokens.nextToken());
        tokens = new StringTokenizer(in.readLine());
        double i = Integer.parseInt(tokens.nextToken()),
               j = Integer.parseInt(tokens.nextToken()),
               k = Integer.parseInt(tokens.nextToken()),
               x = Math.min(Math.min(a/i, b/j), c/k);
        a -= (x*i);   b -= (x*j);   c -= (x*k);

        out.println(a + " " + b + " " + c);

        out.close();
    }
}
