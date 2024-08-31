import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()), sum = 0;
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(tokens.nextToken());
            sum += a[i];
        }

        Arrays.sort(a);
        double half = (double) sum / 2;
        sum = 0;
        int j = 1;

        for(int i = n - 1; i >= 0; i--){
            sum += a[i];
            if(sum > half){
                break;
            }else{
                j++;
            }
        }

        out.println(j);

        out.close();
    }
}
