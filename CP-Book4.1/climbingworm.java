import java.io.*;
import java.util.*;

public class climbingworm{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(tokens.nextToken()),
            b = Integer.parseInt(tokens.nextToken()),
            h = Integer.parseInt(tokens.nextToken()),
            count = 1, i = 0;

        while(true){
            i += a;

            if(i >= h) break;

            i -= b;
            count++;
        }
        out.println(count);

        out.close();
    }
}
