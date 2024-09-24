import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        int[] a = new int[n];
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(tokens.nextToken());
        }

        int m = Integer.parseInt(in.readLine());
        while(m-->0){
            tokens = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(tokens.nextToken()),
                y = Integer.parseInt(tokens.nextToken());
            x--; y--;
            if(1 <= x){
                a[x - 1] += y;
            }
            a[x] -= y;
            
            if(x < n - 1){
                a[x + 1] += a[x] - 1;
            }
            a[x] = 0;
        }

        for(int each : a){
            out.println(each);
        }

        out.close();
    }
}
