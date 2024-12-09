import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken());
        int m = Integer.parseInt(tokens.nextToken());
        char[] arr = in.readLine().toCharArray();

        for (int step = 0; step < m; step++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    arr[i] = 'G';
                    arr[i + 1] = 'B';
                    i++;
                }
            }
        }

        for (char each : arr) {
            out.print(each);
        }

        out.close();
    }
}

