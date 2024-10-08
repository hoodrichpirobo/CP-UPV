import java.io.*;
import java.util.*;

public class combinationlock{
    public static int turn(int from, int to){
        from += 40;
        from -= to;
        from %= 40;
        return from;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String line;
        StringTokenizer tokens;
        while(true){
            line = in.readLine();
            
            if(line.equals("0 0 0 0")) break;
            
            tokens = new StringTokenizer(line);
            int s = Integer.parseInt(tokens.nextToken()),
                a = Integer.parseInt(tokens.nextToken()),
                b = Integer.parseInt(tokens.nextToken()),
                c = Integer.parseInt(tokens.nextToken()),
                ans = 120;

            ans += turn(s, a);
            ans += turn(b, a);
            ans += turn(b, c);

            out.println(ans*9);
        }
        
        out.close();
    }
}
