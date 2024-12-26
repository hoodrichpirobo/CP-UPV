import java.util.*;
import java.io.*;

public class bubbletea{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.readLine());
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int[] teas = new int[N];
        for(int i = 0; i < N; i++){
            teas[i] = Integer.parseInt(tokens.nextToken());
        }

        int M = Integer.parseInt(in.readLine());
        int[] toppings = new int[M];
        tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < M; i++){
            toppings[i] = Integer.parseInt(tokens.nextToken());
        }

        int min = Integer.MAX_VALUE, K;
        for(int i = 0; i < N; i++){
            tokens = new StringTokenizer(in.readLine());
            K = Integer.parseInt(tokens.nextToken());
            for(int j = 0; j < K; j++){
                min = Math.min(min, teas[i] + toppings[Integer.parseInt(tokens.nextToken()) - 1]);
            }
        }

        int X = Integer.parseInt(in.readLine()),
            ans = (X/min) - 1;

        out.println(ans < 0 ? 0 : ans);

        out.close();
    }
}
