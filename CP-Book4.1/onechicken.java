import java.util.*;
import java.io.*;

public class onechicken{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(tokens.nextToken()),
            M = Integer.parseInt(tokens.nextToken());
        int calc = Math.abs(M-N);
        String num = (calc == 1 ? " piece " : " pieces ");
        if(N < M){
            out.println("Dr. Chaz will have " + (calc) + num + "of chicken left over!");
        }else{
            out.println("Dr. Chaz needs " + (calc) + " more" + num + "of chicken!");
        }
        
        out.close();
    }
}
