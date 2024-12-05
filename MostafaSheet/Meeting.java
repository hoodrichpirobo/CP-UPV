import java.util.*;
import java.io.*;

public class Main {
    public static boolean check(int xx, int yy, int[] x, int[] y, int[] r, int n) {
        for (int i = 0; i < n; i++) {
            int dx = x[i] - xx;
            int dy = y[i] - yy;
            if (dx * dx + dy * dy <= r[i] * r[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int xA = Integer.parseInt(tokens.nextToken());
        int yA = Integer.parseInt(tokens.nextToken());
        int xB = Integer.parseInt(tokens.nextToken());
        int yB = Integer.parseInt(tokens.nextToken());

        int x0 = Math.min(xA, xB);
        int x1 = Math.max(xA, xB);
        int y0 = Math.min(yA, yB);
        int y1 = Math.max(yA, yB);

        int n = Integer.parseInt(in.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        int[] r = new int[n];

        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(in.readLine());
            x[i] = Integer.parseInt(tokens.nextToken());
            y[i] = Integer.parseInt(tokens.nextToken());
            r[i] = Integer.parseInt(tokens.nextToken());
        }

        int count = 0;

        for (int i = x0; i <= x1; i++) {
            if (!check(i, y0, x, y, r, n)) count++;
            if (!check(i, y1, x, y, r, n)) count++;
        }

        for (int i = y0 + 1; i < y1; i++) {
            if (!check(x0, i, x, y, r, n)) count++;
            if (!check(x1, i, x, y, r, n)) count++;
        }

        out.println(count);
        out.close();
    }
}
