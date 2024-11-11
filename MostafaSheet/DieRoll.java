import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int Y = Integer.parseInt(tokens.nextToken()),
            W = Integer.parseInt(tokens.nextToken()),
            A = (6 - Math.max(Y, W)) + 1 , B = 6;
        String ans = A + "/" + B;
       
        if((double) (A/A)/(B/A) == (double)A/B){
            ans = (A/A) + "/" + (B/A);
        }else if((double) (A/2)/(B/2) == (double) A/B){
            ans = (A/2) + "/" + (B/2);
        }
        
        out.println(ans);

        out.close();
    }
}
