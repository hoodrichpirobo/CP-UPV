import java.util.*;
import java.io.*;

public class Main {
    static boolean moreThanOnePositive(int[] A) {
        int positive = 0;
        for (int each : A) {
            if (each > 0) {
                positive++;
            }
            if (positive > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(tokens.nextToken());
        }

        int i = 0;
        while (moreThanOnePositive(A)) {
            Arrays.sort(A);
            // Reverse the sorted array to make it descending
            for (int j = 0; j < n / 2; j++) {
                int temp = A[j];
                A[j] = A[n - j - 1];
                A[n - j - 1] = temp;
            }
            // Decrease the two largest elements
            A[0]--;
            A[1]--;
            i++;
        }
        out.println(i);

        out.close();
    }
}
