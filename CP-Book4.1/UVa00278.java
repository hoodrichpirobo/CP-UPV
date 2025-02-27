import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static int solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        char set = tokens.nextToken().charAt(0);
        int m = Integer.parseInt(tokens.nextToken()),
            n = Integer.parseInt(tokens.nextToken()),
            ans = -1;

        switch(set){
            case 'r':
                ans = Math.min(m, n);
                break;
            case 'k':
                ans = ((m*n) + 1)/2;
                break;
            case 'Q':
                ans = Math.min(m, n);
                break;
            case 'K':
                ans = ((m + 1)/2) * ((n + 1)/2);
                break;
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        while(TC-->0){
            ans.append(solve()).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
