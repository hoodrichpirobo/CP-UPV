import java.io.*;
import java.util.*;

public class Main{
    public static int gcd(int A, int B) {
        int divisor = Math.max(A,B);

        while(divisor >= 1){
            if(A % divisor == 0 && B % divisor == 0){
                return divisor;
            }
            divisor--;
        }

        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int Y = Integer.parseInt(tokens.nextToken()),
            W = Integer.parseInt(tokens.nextToken()),
            A = (6 - Math.max(Y, W)) + 1 , B = 6,
            gcd = gcd(A, B);

        out.println(A/gcd + "/" + B/gcd);

        out.close();
    }
}
