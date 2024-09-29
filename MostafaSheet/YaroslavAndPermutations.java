import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        double n = Double.parseDouble(in.readLine());
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int[] a = new int[1000];
        String ans = "YES";
        for(int i = 0; i < n; i++){
            int j = Integer.parseInt(tokens.nextToken()) - 1;
            a[j]++;
            if(a[j] > (n + 1)/2){
                ans = "NO";
                break;
            }
        }

        out.println(ans);

        out.close();
    }
}
