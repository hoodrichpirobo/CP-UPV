import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        StringBuilder ans = new StringBuilder();
        while((line = in.readLine()) != null && !line.isEmpty()){
            StringTokenizer tokens = new StringTokenizer(line);
            int N = Integer.parseInt(tokens.nextToken()),
                i = Integer.parseInt(tokens.nextToken()),
                j = Integer.parseInt(tokens.nextToken()),
                rounds = 0;
            
            while(i != j){
                i = (i + 1)/2;
                j = (j + 1)/2;
                rounds++;
            }

            ans.append(rounds).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
