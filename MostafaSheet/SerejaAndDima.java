import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            l = 0, r = 0;
        int[] c = new int[n];
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        
        for(int i = 0; i < n; i++){
            c[i] = Integer.parseInt(tokens.nextToken());
        }

        n--;
        int j = 0, chosen = 0, i = 0;
        while(j <= n){
            chosen = Math.max(c[j], c[n]);
            if(i%2==0){
                l += chosen;
            }else{
                r += chosen;
            }
            if(chosen == c[j]){
                j++;
            }else{
                n--;
            }
            i++;
        }
        out.println(l + " " + r);

        out.close();
    }
}
