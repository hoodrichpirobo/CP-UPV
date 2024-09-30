import java.io.*;
import java.util.*;

public class artichoke{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        double p = Double.parseDouble(tokens.nextToken()),
               a = Double.parseDouble(tokens.nextToken()),
               b = Double.parseDouble(tokens.nextToken()),
               c = Double.parseDouble(tokens.nextToken()),
               d = Double.parseDouble(tokens.nextToken());
        int n = Integer.parseInt(tokens.nextToken());
        double maxDiff = 0, peak = 0;
        double[] arr = new double[n];
        for(int i = 1; i <= n; i++){
            arr[i - 1] = p * (Math.sin(a*i+b) + Math.cos(c*i+d) + 2);
            if(i == 1 || peak < arr[i - 1]){
                peak = arr[i - 1];
            }else{
                maxDiff = Math.max(maxDiff, (peak - arr[i - 1]));
            }
        }
        
        out.println(maxDiff);
        
        out.close();
    }
}
