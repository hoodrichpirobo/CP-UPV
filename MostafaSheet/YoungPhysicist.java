import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            x = 0, y = 0, z = 0;
        StringTokenizer tokens;
        while(n-->0){
            tokens = new StringTokenizer(in.readLine());
            x += Integer.parseInt(tokens.nextToken());
            y += Integer.parseInt(tokens.nextToken());
            z += Integer.parseInt(tokens.nextToken());
        }
        if(x == 0 && y == 0 && z == 0){
            out.println("YES");
        }else{
            out.println("NO");
        }

        out.close();
    }
}
