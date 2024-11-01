import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        while(true){
            int n = Integer.parseInt(in.readLine()),
                sum = 0;
            
            if(n == 0){
                break;
            }

            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = Integer.parseInt(tokens.nextToken());
            }

            for(int i = 0; i < n; i++){
                if(a[(i - 1 + n)%n] < a[i] && a[i] > a[(i + 1)%n]){
                    sum++;
                }
            }
            out.println(sum);
        }

        out.close();
    }
}
