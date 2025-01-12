import java.io.*;
import java.util.*;

public class eventplanning{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(tokens.nextToken()),
            B = Integer.parseInt(tokens.nextToken()),
            H = Integer.parseInt(tokens.nextToken()),
            W = Integer.parseInt(tokens.nextToken()), 
            cheapest = B;
        
        int[] p = new int[H];
        boolean[] enough = new boolean[H];
        String ans = "stay home";
        for(int i = 0; i < H; i++){
            p[i] = Integer.parseInt(in.readLine()) * N;
            tokens = new StringTokenizer(in.readLine());
            for(int j = 0; j < W; j++){
                if(Integer.parseInt(tokens.nextToken()) >= N){
                    enough[i] = true;
                }
            }

            if(p[i] <= cheapest && enough[i]){
                cheapest = p[i];
                ans = Integer.toString(cheapest);
            }
        }
        out.println(ans);

        out.close();
    }
}
