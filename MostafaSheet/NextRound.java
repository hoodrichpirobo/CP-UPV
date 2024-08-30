import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            k = Integer.parseInt(tokens.nextToken()),
            i = 0;
        int[] a = new int[n];

        tokens = new StringTokenizer(in.readLine());
        for(i = 0; i < n; i++){
            a[i] = Integer.parseInt(tokens.nextToken());

            if(a[i] < a[k - 1] || a[i] == 0){
                break;
            }
        }
        out.println(i);

        out.close();
    }
}
