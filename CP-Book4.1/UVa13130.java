import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static String solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int prev = Integer.parseInt(tokens.nextToken());
        while(tokens.hasMoreTokens()){
            int current = Integer.parseInt(tokens.nextToken());
            if(prev + 1 != current){
                return "N";
            }
            prev = current;
        }
        return "Y";
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        while(TC-->0){
            out.println(solve());
        }

        out.close();
    }
}
