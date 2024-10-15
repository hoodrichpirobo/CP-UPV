import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static void solve() throws Exception {
        String sLine = in.readLine(), tLine = in.readLine();
        char[] s = sLine.toCharArray(),
               t = tLine.toCharArray();
        int minLength = Math.min(s.length, t.length), j = 0;
        while(j < minLength
                && sLine.charAt(j) == tLine.charAt(j)) {
            j++;
        }

        if(j == 0){
            out.println(s.length + t.length);
        }else{
            out.println(j + 1 + s.length - j + t.length - j);
        }
        
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        for(int i = 1; i <= TC; i++){
            solve();
        }

        out.close();
    }
}
