import java.io.*;
import java.util.*;

public class Main{
    public static String solve(String line){
        StringTokenizer tokens = new StringTokenizer(line);
        int k = Integer.parseInt(tokens.nextToken()),
            q = Integer.parseInt(tokens.nextToken()),
            s = Integer.parseInt(tokens.nextToken());

        if(k == q) return "Illegal state\n";
        if(((s-q)%8 != 0 && s/8 != q/8) || q == s) return "Illegal move\n";
        if(((k - q)%8 == 0 && (k-s)%8 == 0) || (k/8 == q/8 && k/8 == s/8)){
            if(k <= Math.max(q, s) && k >= Math.min(q, s)) return "Illegal move\n";
        }

        int diff = Math.max(k, s) - Math.min(k, s);

        if(diff == 8 || (diff == 1 && k/8 == s/8)) return "Move not allowed\n";
        if((k == 0 && s == 9) || (k == 7 && s == 14) || (k == 56 && s == 49) || (k == 63 && s == 54))
            return "Stop\n";
        return "Continue\n";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        StringBuilder ans = new StringBuilder();
        while((line = in.readLine()) != null && !line.isEmpty()){
            ans.append(solve(line));
        }
        out.print(ans);

        out.close();
    }
}
