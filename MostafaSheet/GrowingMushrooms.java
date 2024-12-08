import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken());
        double t1 = Double.parseDouble(tokens.nextToken()),
               t2 = Double.parseDouble(tokens.nextToken()),
               k = (100 - Double.parseDouble(tokens.nextToken())) / 100,
               a, b;
        double[][] arr = new double[n][2];
        for(int i = 0; i < n; i++){
            tokens = new StringTokenizer(in.readLine());
            a = Double.parseDouble(tokens.nextToken());
            b = Double.parseDouble(tokens.nextToken());
            arr[i][0] = i + 1;
            arr[i][1] = Math.max((a*t1*k) + (b*t2), (b*t1*k) + (a*t2)); 
        }

        Arrays.sort(arr, Comparator.comparingDouble(x -> - x[1]));

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i>0){
                ans.append("\n");
            }
            ans.append(((int)(arr[i][0])) + " " + String.format("%.2f", arr[i][1]));
        }
        out.print(ans);

        out.close();
    }
}
