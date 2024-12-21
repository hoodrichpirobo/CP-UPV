import java.util.*;
import java.io.*;

public class mosquito{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        StringBuilder ans = new StringBuilder();
        while((line = in.readLine()) != null && !line.isEmpty()){
            StringTokenizer tokens = new StringTokenizer(line);
            int M = Integer.parseInt(tokens.nextToken()),
                P = Integer.parseInt(tokens.nextToken()),
                L = Integer.parseInt(tokens.nextToken()),
                E = Integer.parseInt(tokens.nextToken()),
                R = Integer.parseInt(tokens.nextToken()),
                S = Integer.parseInt(tokens.nextToken()),
                N = Integer.parseInt(tokens.nextToken()),
                aux;

            for(int i = 0; i < N; i++){
                aux = M;
                M = P/S;
                P = L/R;
                L = aux*E;
            }

            ans.append(M + "\n");
        }
        out.print(ans);

        out.close();
    }
}
