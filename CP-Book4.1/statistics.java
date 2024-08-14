import java.util.*;
import java.io.*;

public class statistics{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String line;
        int c = 0;

        while(((line = in.readLine()) != null) && (!line.isEmpty())){
            StringTokenizer tokens = new StringTokenizer(line);
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE,
                n = Integer.parseInt(tokens.nextToken());

            while(n-->0){
                int a = Integer.parseInt(tokens.nextToken());
                    min = Math.min(a, min);
                    max = Math.max(a, max);
            }

            out.printf("Case %d: %d %d %d\n", ++c, min, max, (max - min));
        }
        
        out.close();
    }
}
