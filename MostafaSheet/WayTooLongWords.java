import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        String line = in.readLine();
        int n = line.length();
        if(n<=10) return line;

        return (line.charAt(0) + Integer.toString(n-2) + line.charAt(n-1));
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
