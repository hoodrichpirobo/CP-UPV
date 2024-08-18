import java.util.*;
import java.io.*;

public class jobexpenses{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        in.readLine();
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int ans = 0;
        while(tokens.hasMoreTokens()){
            int current = Integer.parseInt(tokens.nextToken());
            if(current < 0){
                ans += current;
            }
        }
        out.println(Math.abs(ans));
        
        out.close();
    }
}
