import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static int solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        double length = Double.parseDouble(tokens.nextToken()),
               width = Double.parseDouble(tokens.nextToken()),
               depth = Double.parseDouble(tokens.nextToken()),
               weight = Double.parseDouble(tokens.nextToken());

        return ((length <= 56 && width <= 45 && depth <= 25) ||
                (length + width + depth) <= 125) && weight <= 7 ? 1 : 0;
    }
    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine()),
            sum = 0, current;
        while(TC-->0){
            current = solve();
            out.println(current);
            sum += current;
        }
        out.println(sum);

        out.close();
    }
}
