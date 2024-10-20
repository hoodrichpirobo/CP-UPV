import java.io.*;
import java.util.*;

public class hothike {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()), d = 0,
            max = Integer.MIN_VALUE, t = Integer.MAX_VALUE;
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int[] Ti = new int[n];
        for(int i = 0; i < n; i++){
            Ti[i] = Integer.parseInt(tokens.nextToken());
        }

        for(int i = 0; i < n - 2; i++){
            max = Math.max(Ti[i], Ti[i + 2]);
            if(t > max){
                d = i + 1;
                t = max;
            }
        }
        out.println(d + " " + t);

        out.close();
    }
}
