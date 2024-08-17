import java.util.*;
import java.io.*;

public class licensetolaunch {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        int c = 0, min = Integer.MAX_VALUE, minIndex = -1;
        StringTokenizer tokens = new StringTokenizer(in.readLine());

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(tokens.nextToken());
            if (value < min) {
                min = value;
                minIndex = c;
            }
            c++;
        }

        out.println(minIndex);
        out.close();
    }
}
