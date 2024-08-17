import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        int[] a = new int[n];
        StringTokenizer tokens = new StringTokenizer(in.readLine()); 

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(tokens.nextToken());
        }

        Arrays.sort(a);

        for(int each : a){
            out.print(each + " ");
        }

        out.close();
    }
}
