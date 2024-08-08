import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static int solve() throws Exception{
        StringTokenizer tokens = new StringTokenizer(in.readLine());

        int approvals = 0;
        while(tokens.hasMoreTokens()){
            approvals += Integer.parseInt(tokens.nextToken());
        }

        return approvals >= 2 ? 1 : 0;
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            sum = 0;
        while(n-->0){
            sum += solve();
        }
        out.println(sum);

        out.close();
    }
}
