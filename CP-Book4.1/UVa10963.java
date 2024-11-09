import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        int w = Integer.parseInt(in.readLine());
        StringTokenizer tokens;
        int[] diffs = new int[w];
        String ans = "yes";
        for(int i = 0; i < w; i++){
            tokens = new StringTokenizer(in.readLine());
            diffs[i] = Integer.parseInt(tokens.nextToken()) - Integer.parseInt(tokens.nextToken());
            if(i > 0 && diffs[i] != diffs[i - 1]){
                ans = "no";
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            in.readLine();
            out.println(solve());
            if(t >= 1){
                out.println();
            }
        }

        out.close();
    }
}
