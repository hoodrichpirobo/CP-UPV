import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        int k = 0;
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(tokens.nextToken()),
                p = Integer.parseInt(tokens.nextToken());

            if(n == 0 && p == 0){
                break;
            }

            while(n-->0){
                in.readLine();
            }

            String line, rfp = "";
            double d, minD = Double.MAX_VALUE;
            int r, maxR = Integer.MIN_VALUE;
            for(int i = 0; i < p; i++){
                line = in.readLine();
                tokens = new StringTokenizer(in.readLine());
                d = Double.parseDouble(tokens.nextToken());
                r = Integer.parseInt(tokens.nextToken());
                if(maxR < r){
                    maxR = r;
                    minD = d;
                    rfp = line;
                }else if(maxR == r && minD > d){
                    maxR = r;
                    minD = d;
                    rfp = line;
                }
                for(int j = 0; j < r; j++){
                    in.readLine();
                }
            }

            if(k>0){
                ans.append("\n");
            }
            ans.append(String.format("RFP #%d\n%s\n", ++k, rfp));
        }
        out.print(ans);

        out.close();
    }
}
