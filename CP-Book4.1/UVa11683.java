import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());

            int A = Integer.parseInt(tokens.nextToken());

            if(A == 0){
                break;
            }

            int C = Integer.parseInt(tokens.nextToken());

            tokens = new StringTokenizer(in.readLine());
            
            int current = Integer.parseInt(tokens.nextToken()),
                previous = current, sum = (A - current);

            for(int i = 1; i < C; i++){
                current = Integer.parseInt(tokens.nextToken());
                if(current < previous){
                    sum += (previous - current);
                }
                previous = current;
            }

            ans.append(sum + "\n");
        }
        out.print(ans);

        out.close();
    }
}
