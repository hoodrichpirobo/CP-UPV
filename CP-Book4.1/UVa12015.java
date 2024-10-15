import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        int relevance = Integer.MIN_VALUE,
            current;
        StringBuilder ans = new StringBuilder();
        StringTokenizer tokens;
        String url;
        for(int i = 0; i < 10; i++){
            tokens = new StringTokenizer(in.readLine());
            url = tokens.nextToken();
            current = Integer.parseInt(tokens.nextToken());
            if(current > relevance){
                ans = new StringBuilder("\n" + url);
                relevance = current;
            }else if(current == relevance){
                ans.append("\n" + url);
            }
        }
        return ans.toString() + "\n";
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        for(int i = 1; i <= TC; i++){
            out.printf("Case #%d: %s", i, solve());
        }

        out.close();
    }
}
