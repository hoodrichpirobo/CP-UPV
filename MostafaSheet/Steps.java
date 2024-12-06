import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            m = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(in.readLine());
        int x = Integer.parseInt(tokens.nextToken()),
            y = Integer.parseInt(tokens.nextToken());

        int k = Integer.parseInt(in.readLine()),
            dx, dy;
        long maxX, maxY, max, count = 0;

        for(int i = 0; i < k; i++){
            tokens = new StringTokenizer(in.readLine());
            dx = Integer.parseInt(tokens.nextToken());
            dy = Integer.parseInt(tokens.nextToken());

            maxX = (dx > 0) ? (n - x)/dx : (dx < 0) ? (x - 1)/-dx : Long.MAX_VALUE;
            maxY = (dy > 0) ? (m - y)/dy : (dy < 0) ? (y - 1)/-dy : Long.MAX_VALUE;

            max = Math.min(maxX, maxY);

            x += (max*dx);
            y += (max*dy);

            count += max;
        }

        out.println(count);
        
        out.close();
     }
}
