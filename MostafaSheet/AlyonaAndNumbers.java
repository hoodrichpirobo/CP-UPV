import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        long n = Long.parseLong(tokens.nextToken());
        long m = Long.parseLong(tokens.nextToken());

        long totalPairs = countValidPairs(n, m);
        out.println(totalPairs);

        out.close();
    }

   public static long countValidPairs(long n, long m) {
        long qx = n / 5;
        long qy = m / 5;
        
        long rx = n % 5;
        long ry = m % 5;
        
        long completeBlocks = 5 * qx * qy;
        long xResidual = qx * ry;
        long yResidual = qy * rx;
        long combinedResidual = Math.max(rx + ry - 4, 0);

        return completeBlocks + xResidual + yResidual + combinedResidual;
    }
}
