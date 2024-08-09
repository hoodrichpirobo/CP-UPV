import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static void solve() throws Exception{
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(tokens.nextToken()),
            b = Integer.parseInt(tokens.nextToken());

        if(a > b){
            out.println(">");
        }else if(a < b){
            out.println("<");
        }else{
            out.println("=");
        }
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        while(TC-->0){
            solve();
        }

        out.close();
    }
}
