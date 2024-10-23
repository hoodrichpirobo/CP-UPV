import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            min, max;
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(tokens.nextToken());
        }

        for(int i = 0; i < n; i++){
            min = Integer.MAX_VALUE; max = Integer.MIN_VALUE;
            if(i < n - 1){
                min = Math.min(min, Math.abs(x[i] - x[i + 1]));
                max = Math.max(max, Math.abs(x[i] - x[n - 1]));
            }
            if(i > 0){
                min = Math.min(min, Math.abs(x[i] - x[i - 1]));
                max = Math.max(max, Math.abs(x[i] - x[0]));
            }
            out.println(min + " " + max);
        }

        out.close();
    }
}
