import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        BigInteger n = new BigInteger(tokens.nextToken()),
                   m = new BigInteger(tokens.nextToken());
        if(n.nextProbablePrime().equals(m)){
            out.println("YES");
        }else{
            out.println("NO");
        }

        out.close();
    }
}
