import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static void solve() throws Exception {
        String line = in.readLine();

        if(line.matches(".ne|o.e|on.")){
            out.println(1);
        }
        if(line.matches(".wo|t.o|tw.")){
            out.println(2);
        }
        if(line.matches(".hree|t.ree|th.ee|thr.e|thre.")){
            out.println(3);
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
