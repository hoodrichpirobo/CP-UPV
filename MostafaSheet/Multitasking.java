import java.io.*;
import java.util.*;

public class Main{
    public static String bubblesort(int m, int k){
        String ans = "";
        if(k == 0){
            int len;
            for(int i = 0; i < m; i++){
                len = m - i;
                for(int j = 1; j < len; j++){
                    ans += (j + " " + (j + 1) + '\n');
                }
            }
        }else{
            int len;
            for(int i = 1; i < m; i++){
                len = i;
                for(int j = m; j > i; j--){
                    ans += (j + " " + (j - 1) + '\n');
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            m = Integer.parseInt(tokens.nextToken()),
            k = Integer.parseInt(tokens.nextToken());
        for(int i = 0; i < n; i++){
            in.readLine();
        }
        out.println((m*(m - 1))/2);
        out.print(bubblesort(m, k));

        out.close();
    }
}
