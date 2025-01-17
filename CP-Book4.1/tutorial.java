import java.util.*;
import java.io.*;

public class tutorial {
    static BufferedReader br;
    static PrintWriter pw;
    static double totalTime;

    public static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        String[] token = br.readLine().split(" ");

        int m = Integer.parseInt(token[0]),
            n = Integer.parseInt(token[1]),
            t = Integer.parseInt(token[2]);

        if (t == 1) {
            // Check if n is reasonably small to avoid large factorial calculations
            if (n > 20) {
                totalTime = Double.MAX_VALUE; // Set to a very large value
            } else {
                totalTime = factorial(n);
            }
        } else if (t == 2) {
            if (n > 60) { // 2^60 is a large number
                totalTime = Double.MAX_VALUE;
            } else {
                totalTime = Math.pow(2, n);
            }
        } else if (t == 3) {
            totalTime = Math.pow(n, 4);
        } else if (t == 4) {
            totalTime = Math.pow(n, 3);
        } else if (t == 5) {
            totalTime = Math.pow(n, 2);
        } else if (t == 6) {
            totalTime = n * (Math.log(n) / Math.log(2));
        } else if (t == 7) {
            totalTime = n;
        }

        if (m >= totalTime) {
            pw.println("AC");
        } else {
            pw.println("TLE");
        }
        
        pw.close();
    }
}
