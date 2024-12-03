import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        int[][] arr = new int[n][2];
        StringTokenizer tokens;

        for(int i = 0; i < n; i++){
            tokens = new StringTokenizer(in.readLine());
            arr[i][0] = Integer.parseInt(tokens.nextToken());
            arr[i][1] = Integer.parseInt(tokens.nextToken());
        }
        
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);

        for(int i = 0; i < n; i++){
            out.println(arr[i][0] + " " + arr[i][1]);
        }

        out.close();
    }
}
