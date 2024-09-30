import java.io.*;
import java.util.*;

public class artichoke {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
      
        String line; 
        while ((line = in.readLine()) != null && !line.isEmpty()) {
            StringTokenizer tokens = new StringTokenizer(line);
            double p = Double.parseDouble(tokens.nextToken()),
                   a = Double.parseDouble(tokens.nextToken()),
                   b = Double.parseDouble(tokens.nextToken()),
                   c = Double.parseDouble(tokens.nextToken()),
                   d = Double.parseDouble(tokens.nextToken());
            int n = Integer.parseInt(tokens.nextToken());

            double maxDecline = 0, peak = 0;

            // Precompute the initial angles and their increments modulo 2π
            double twoPi = 2 * Math.PI;
            double aMod = a % twoPi;
            double bMod = b % twoPi;
            double cMod = c % twoPi;
            double dMod = d % twoPi;

            double angle1 = (aMod + bMod) % twoPi;
            double angle2 = (cMod + dMod) % twoPi;

            // Angles increment per iteration
            double deltaAngle1 = aMod;
            double deltaAngle2 = cMod;

            for (int i = 1; i <= n; i++) {
                double sinValue = Math.sin(angle1);
                double cosValue = Math.cos(angle2);
                double price = p * (sinValue + cosValue + 2);

                if (i == 1 || price > peak) {
                    peak = price;
                } else {
                    maxDecline = Math.max(maxDecline, peak - price);
                }

                // Update angles for next iteration
                angle1 += deltaAngle1;
                if (angle1 >= twoPi) angle1 -= twoPi; // Keep angle within [0, 2π)
                angle2 += deltaAngle2;
                if (angle2 >= twoPi) angle2 -= twoPi;
            }
            out.println(maxDecline);
        }
        out.close();
    }
}
