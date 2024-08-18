import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static String solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        while(tokens.hasMoreTokens()){
            if(tokens.nextToken().equals("0")){
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        for(int i = 1; i <= TC; i++){
            out.printf("Set #%d: %s\n", i, solve());
        }

        out.close();
    }
}
