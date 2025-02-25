import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int n = s.length();
        int m = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int half = n / 2;
        int[] diff = new int[half + 2];
        
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a <= half) {
                diff[a]++;
                diff[half + 1]--;
            }
        }
        
        for (int i = 1; i <= half; i++) {
            diff[i] += diff[i - 1];
        }
        
        char[] arr = s.toCharArray();
        for (int i = 1; i <= half; i++) {
            if (diff[i] % 2 == 1) {
                char temp = arr[i - 1];
                arr[i - 1] = arr[n - i];
                arr[n - i] = temp;
            }
        }
        
        System.out.println(new String(arr));
    }
}
