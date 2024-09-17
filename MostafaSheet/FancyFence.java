import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        int a = Integer.parseInt(in.readLine());

        if(360%(180 - a) == 0){
            return "YES";
        }else{
            return "NO";
        }
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
