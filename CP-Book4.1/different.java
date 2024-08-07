import java.util.*;
import java.io.*;

public class different{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        String line;
        while(((line = in.readLine()) != null) && !(line.isEmpty())){
            StringTokenizer tokens = new StringTokenizer(line);
            long a = Long.parseLong(tokens.nextToken()),
                b = Long.parseLong(tokens.nextToken());
            out.println(Math.abs(a-b));
        }
        
        out.close();
    }
}
