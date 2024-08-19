import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int[] a = new int[4];
        for(int i = 0; i < 4; i++){
            a[i] = Integer.parseInt(tokens.nextToken());
        }

        String line = in.readLine();
        int sum = 0;
        for(char c : line.toCharArray()){
            sum += a[c - '1'];
        }
        out.println(sum);

        out.close();
    }
}
