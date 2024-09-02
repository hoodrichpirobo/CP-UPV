import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            k = Integer.parseInt(tokens.nextToken());
        tokens = new StringTokenizer(in.readLine());
        int[] y = new int[2*n + 1];

        for(int i = 0; i < 2*n + 1; i++){
            y[i] = Integer.parseInt(tokens.nextToken());
        }

        for(int i = 1; i <= 2*n + 1; i++){
            if(i%2==0 && k > 0 && y[i - 2] < y[i - 1] - 1 && y[i - 1] - 1 > y[i]){
                y[i - 1]--;
                k--;
            }
        }

        for(int each : y){
            out.print(each + " ");
        }

        out.close();
    }
}
