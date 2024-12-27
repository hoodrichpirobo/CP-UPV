import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        StringBuilder ans = new StringBuilder();
        while((line = in.readLine()) != null && !line.isEmpty()){
            StringTokenizer tokens = new StringTokenizer(line);
            int N = Integer.parseInt(tokens.nextToken()),
                B = Integer.parseInt(tokens.nextToken()),
                H = Integer.parseInt(tokens.nextToken()),
                W = Integer.parseInt(tokens.nextToken()),
                max, min = Integer.MAX_VALUE;
            int[] prices = new int[H];
            int[] beds = new int[H];

            for(int i = 0; i < H; i++){
                max = Integer.MIN_VALUE;
                prices[i] = Integer.parseInt(in.readLine());
                tokens = new StringTokenizer(in.readLine());
                for(int j = 0; j < W; j++){
                    max = Math.max(max, Integer.parseInt(tokens.nextToken()));
                }
                if(max > N){
                    min = Math.min(min, prices[i]*N);
                }
            }
            if(0 < min && min <= B){
                ans.append(min + "\n");
            }else{
                ans.append("stay home\n");
            }
        }
        out.print(ans);

        out.close();
    }
}
