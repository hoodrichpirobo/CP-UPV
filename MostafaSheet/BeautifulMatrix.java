import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int i = 1, j = 1, n = 0;
        StringTokenizer tokens;
        while(i <= 5){
            tokens = new StringTokenizer(in.readLine());
            j = 1;
            while(j <= 5){
                n = Integer.parseInt(tokens.nextToken());
                if(n == 1){
                    break;
                }
                j++;
            }
            if(n == 1){
                break;
            }
            i++;
        }
        
        out.println(Math.abs(3-i) + Math.abs(3-j));

        out.close();
    }
}
