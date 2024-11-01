import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        BigInteger m = BigInteger.valueOf(Long.parseLong(in.readLine()));
        BigInteger b = new BigInteger("1378");
        b = b.modPow(m, BigInteger.TEN);
        out.println(b);

        out.close();
    }
}
