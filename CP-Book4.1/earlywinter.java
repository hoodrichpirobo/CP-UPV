import java.util.*;
import java.io.*;

public class earlywinter{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            d = Integer.parseInt(tokens.nextToken());
        tokens = new StringTokenizer(in.readLine());
        String ans = "It had never snowed this early!";
        for(int k = 0; k < n; k++){
            int i = Integer.parseInt(tokens.nextToken());
            if(i <= d){
                ans = "It hadn't snowed this early in " + k + " years!";
                break;
            }
        }
        out.println(ans);
        
        out.close();
    }
}
