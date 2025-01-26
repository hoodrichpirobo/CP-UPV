import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int H = Integer.parseInt(tokens.nextToken());

            if(H == 0) break;

            int U = Integer.parseInt(tokens.nextToken()),
                D = Integer.parseInt(tokens.nextToken()),
                F = Integer.parseInt(tokens.nextToken()),
                count = 1;
            double i = 0, fatigue = (F*U)/100.0,
                   climb = U;

            while(true){
                i += climb;
                if(i > H) break;
                i -= D;
                if(i < 0) break;
                climb = Math.max(0, climb - fatigue);
                count++;
            }

            if(i < 0) ans.append("failure on day ");
            else ans.append("success on day ");
            ans.append(count).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
