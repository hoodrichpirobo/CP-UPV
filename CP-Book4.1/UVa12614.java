import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static int solve() throws Exception {
        int N = Integer.parseInt(in.readLine()),
            max = Integer.MIN_VALUE;
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        for(int j = 0; j < N; j++){
            max = Math.max(Integer.parseInt(tokens.nextToken()), max);
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i <= TC; i++){
            ans.append(String.format("Case %d: %d\n", i, solve()));
        }
        out.print(ans);

        out.close();
    }
}
