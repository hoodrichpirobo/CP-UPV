import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n, j;
        StringTokenizer tokens;
        long sum, mult;
        while(true){
            n = Integer.parseInt(in.readLine());

            if(n == 0){
                break;
            }

            tokens = new StringTokenizer(in.readLine());
            sum = 0;
            mult = 0;

            for(int i = 0; i < n; i++){
                j = Integer.parseInt(tokens.nextToken());
                mult += j*sum;
                sum += j;
            }

            out.println(mult);
        }

        out.close();
    }
}
