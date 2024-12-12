import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        for(int i = 1; i <= n; i++){
            map.put(Integer.parseInt(tokens.nextToken()), i);
        }

        int m = Integer.parseInt(in.readLine()), b;
        long V = 0, P = 0;
        n++;
        tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < m; i++){
            b = Integer.parseInt(tokens.nextToken());
            V += map.get(b);
            P += (n - map.get(b));
        }

        out.println(V + " " + P);

        out.close();
    }
}
