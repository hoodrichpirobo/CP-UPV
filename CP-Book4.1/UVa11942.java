import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.readLine());
        StringTokenizer tokens;
        int[] a;
        boolean inc, dec;
        out.println("Lumberjacks:");
        for(int i = 0; i < N; i++){
            a = new int[10];
            tokens = new StringTokenizer(in.readLine());
            StringBuilder ans = new StringBuilder("Ordered");
            inc = false; dec = false;
            for(int j = 0; j < 10; j++){
                a[j] = Integer.parseInt(tokens.nextToken());
                if(j > 0){
                    inc = a[j] > a[j - 1] ? true : inc;
                    dec = a[j] < a[j - 1] ? true : dec;
                }

                if(inc && dec){
                    ans = new StringBuilder("Unordered");
                    break;
                }
            }
            out.println(ans);
        }

        out.close();
    }
}
