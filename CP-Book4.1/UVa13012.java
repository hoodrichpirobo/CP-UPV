import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        while((line = in.readLine()) != null && !line.isEmpty()){
            int T = Integer.parseInt(line),
                g = 0;
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            while(tokens.hasMoreTokens()){
                if(T == Integer.parseInt(tokens.nextToken())){
                    g++;
                }
            }
            out.println(g);
        }

        out.close();
    }
}
