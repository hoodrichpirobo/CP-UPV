import java.io.*;
import java.util.*;

public class driversdilemma{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        double C = Double.parseDouble(tokens.nextToken()),
               X = Double.parseDouble(tokens.nextToken()),
               M = Double.parseDouble(tokens.nextToken());

        int[] mph = new int[6];
        double[] mpg = new double[6];
        for(int i = 0; i < 6; i++){
            tokens = new StringTokenizer(in.readLine());
            mph[i] = Integer.parseInt(tokens.nextToken());
            mpg[i] = Double.parseDouble(tokens.nextToken());
        }

        C /= 2;
        int ans = -1;

        for(int i = 0; i < 6; i++){
            double time = M/mph[i],
                   fuelUse = M/mpg[i],
                   fuelLeak = X * time,
                   total = fuelUse + fuelLeak;

            if(total <= C && mph[i] > ans){
                ans = mph[i];
            }
        }

        if(ans <= 0){
            out.println("NO");
        }else{
            out.println("YES " + ans);
        }

        out.close();
    }
}
