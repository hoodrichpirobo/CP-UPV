import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(tokens.nextToken());
        }
        Arrays.sort(a);
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(i > 0 && a[i] != a[i - 1] + 1) ans += (a[i] - (a[i-1] + 1));
        }
        out.println(ans);

        out.close();
    }
}
