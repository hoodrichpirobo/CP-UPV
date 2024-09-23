import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            k = Integer.parseInt(tokens.nextToken()),
            sum = 0;
        while(n-->0){
            tokens = new StringTokenizer(in.readLine());
            int l = Integer.parseInt(tokens.nextToken()),
                r = Integer.parseInt(tokens.nextToken());
            sum += (r - l + 1);
        }

        int ans = sum%k;
        if(ans==0){
            out.println(ans);
        }else{
            out.println(k-ans);
        }

        out.close();
    }
}
