import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        long n = Long.parseLong(tokens.nextToken()),
             a = Long.parseLong(tokens.nextToken()),
             b = Long.parseLong(tokens.nextToken());
        tokens = new StringTokenizer(in.readLine());
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            ans.append(((Long.parseLong(tokens.nextToken())*a)%b)/a).append(" ");
        }
        out.println(ans);

        out.close();
    }
}
