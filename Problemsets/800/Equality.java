import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            k = Integer.parseInt(tokens.nextToken()),
            min = Integer.MAX_VALUE;
        char[] arr = in.readLine().toCharArray();
        int[] ks = new int[k];
        for(int i = 0; i < arr.length; i++){
            ks[((int) arr[i])-65]++;
        }
        for(int i = 0; i < k; i++){
            min = Math.min(ks[i], min);
        }
        out.println(min*k);

        out.close();
    }
}
