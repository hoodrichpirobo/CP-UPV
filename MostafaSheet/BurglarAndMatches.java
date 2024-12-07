import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int m = Integer.parseInt(tokens.nextToken()),
            n = Integer.parseInt(tokens.nextToken());
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            tokens = new StringTokenizer(in.readLine());
            arr[i][0] = Integer.parseInt(tokens.nextToken());
            arr[i][1] = Integer.parseInt(tokens.nextToken());
        }

        Arrays.sort(arr, (a, b) -> - a[1] + b[1]);

        int a, countA = 0, countB = 0;
        for(int i = 0; i < n; i++){
            if (countA < m) {
                a = Math.min(arr[i][0], m - countA);
                countA += a;
                countB += a*arr[i][1];
            }else{
                break;
            }
        }
        out.println(countB);

        out.close();
    }
}
