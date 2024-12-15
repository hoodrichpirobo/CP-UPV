import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            k = Integer.parseInt(tokens.nextToken()),
            sum = 0, min = Integer.MAX_VALUE;
        int[] a = new int[n];
        tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(tokens.nextToken());
            if(a[i] <= 0 && k > 0){
                a[i] = -a[i];
                k--;
            }
            sum += a[i];
            min = Math.min(a[i], min);
        }

        if(k % 2 != 0){
            sum -= 2 * min;
        }

        out.println(sum);

        out.close();
    }
}
