import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            m = Integer.parseInt(tokens.nextToken()),
            a, b, c, debt = 0;
        int[] arr = new int[n];
        for(int i = 0; i < m; i++){
            tokens = new StringTokenizer(in.readLine());
            a = Integer.parseInt(tokens.nextToken());
            b = Integer.parseInt(tokens.nextToken());
            c = Integer.parseInt(tokens.nextToken());

            arr[a - 1] -= c;
            arr[b - 1] += c;
        }

        Arrays.sort(arr);
        for(int i = 0; i < n && arr[i] < 0; i++){
            debt += Math.abs(arr[i]);
        }
        out.println(debt);

        out.close();
    }
}
