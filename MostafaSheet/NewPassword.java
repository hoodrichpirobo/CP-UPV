import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            k = Math.min(Integer.parseInt(tokens.nextToken()), 26);
        char c;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            c = (char) ('a' + (i%k));
            ans.append(c);
        }
        out.println(ans);

        out.close();
    }
}
