import java.io.*;
import java.util.*;

public class exactlyelectrical{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(tokens.nextToken()),
            b = Integer.parseInt(tokens.nextToken());
        tokens = new StringTokenizer(in.readLine());
        int c = Integer.parseInt(tokens.nextToken()),
            d = Integer.parseInt(tokens.nextToken()),
            t = Integer.parseInt(in.readLine()),
            path = Math.abs(a - c) + Math.abs(b - d);

        if(path%2 == t%2 && t >= path){
            out.println("Y");
        }else{
            out.println("N");
        }

        out.close();
    }
}
