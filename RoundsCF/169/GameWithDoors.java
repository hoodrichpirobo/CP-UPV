import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static void solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int l = Integer.parseInt(tokens.nextToken()),
            r = Integer.parseInt(tokens.nextToken());
        tokens = new StringTokenizer(in.readLine());
        int L = Integer.parseInt(tokens.nextToken()),
            R = Integer.parseInt(tokens.nextToken());

        r++; R++;

        if(r <= L || R <= l) {
            out.println(1);
        }else{
            if(l > L){
                int temp = l;
                l = L;
                L = temp;
            }
            if(r > R){
                int temp = r;
                r = R;
                R = temp;
            }
            out.println(Math.min(r, R - 1) - Math.max(l + 1, L) + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        while(TC-->0){
            solve();
        }

        out.close();
    }
}
