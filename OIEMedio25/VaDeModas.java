import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        while(true){
            int n = Integer.parseInt(in.readLine());

            if(n == 0){
                break;
            }

            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = Integer.parseInt(tokens.nextToken());
            }

            Arrays.sort(a);
            int max = 0, rep = 1, ans = 0;
            for(int i = 1; i < n; i++){
                if(a[i - 1] == a[i]){
                    rep++;
                }else{
                    rep = 1;
                }

                if(rep > max){
                    ans = a[i];
                    max = rep;
                }
            }
            out.println(ans);
        }

        out.close();
    }
}
