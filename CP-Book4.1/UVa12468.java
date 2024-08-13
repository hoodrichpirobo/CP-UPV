import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        while(true){
            String line = in.readLine();
            if(line.equals("-1 -1")){
                break;
            }

            StringTokenizer tokens = new StringTokenizer(line);
            int a = Integer.parseInt(tokens.nextToken()),
                b = Integer.parseInt(tokens.nextToken()),
                max = Math.max(a, b),
                min = Math.min(a, b);
            
            int up = max - min,
                down = min + 100 - max;

            out.println(Math.min(up, down));            
        }

        out.close();
    }
}
