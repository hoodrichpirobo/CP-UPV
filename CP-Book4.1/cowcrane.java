import java.io.*;
import java.util.*;

public class cowcrane{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int m = Integer.parseInt(tokens.nextToken()),
            l = Integer.parseInt(tokens.nextToken());
        tokens = new StringTokenizer(in.readLine());
        int M = Integer.parseInt(tokens.nextToken()),
            L = Integer.parseInt(tokens.nextToken());
        tokens = new StringTokenizer(in.readLine());
        int Tm = Integer.parseInt(tokens.nextToken()),
            Tl = Integer.parseInt(tokens.nextToken()),
            pathAm = Math.abs(m) + Math.abs(m - M),
            pathAl = pathAm +Math.abs(M - l) + Math.abs(l - L),
            pathBl = Math.abs(l) + Math.abs(l - L),
            pathBm = pathBl + Math.abs(L - m) + Math.abs(m - M),
            pathCm = Math.abs(l) + Math.abs(l - m) + Math.abs(m-M),
            pathCl = pathCm + Math.abs(m - M) + Math.abs(m - L),
            pathDl = Math.abs(m) + Math.abs(m - l) + Math.abs(l - L),
            pathDm = pathDl + Math.abs(l - L) + Math.abs(l - M);
        
        if((pathAm <= Tm && pathAl <= Tl) || (pathBl <= Tl && pathBm <= Tm) ||
            (pathCl <= Tl && pathCm <= Tm) || (pathDm <= Tm && pathDl <= Tl)) out.println("possible");
        else out.println("impossible");

        out.close();
    }
}
