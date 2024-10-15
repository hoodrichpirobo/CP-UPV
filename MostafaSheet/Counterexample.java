import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        long l = Long.parseLong(tokens.nextToken()),
             r = Long.parseLong(tokens.nextToken());

        if(l % 2 != 0){
            l++;
        }

        if(l + 2 > r){
            out.println(-1);
        }else{
            out.println(l + " " + (l + 1) + " " + (l + 2));
        }

        out.close();
    }
}
