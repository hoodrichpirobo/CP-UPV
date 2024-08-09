import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static String solve() throws Exception{
        StringTokenizer tokens = new StringTokenizer(in.readLine());

        for(int i = 0; i < 3; ++i){
            if(Integer.parseInt(tokens.nextToken()) > 20){
                return "bad";
            }
        }
        return "good";
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        int c = 0;
        while(TC-->0){
            out.printf("Case %d: %s\n", ++c, solve());
        }

        out.close();
    }
}
