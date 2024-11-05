import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder(), row;
        boolean[] has = new boolean[n + 1];
        int next = n, j;
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++){
            j = Integer.parseInt(tokens.nextToken());
            has[j] = true;

            if(j == next){
                row = new StringBuilder();

                while(next > 0 && has[next]){
                    row.append(next).append(' ');
                    next--;
                }

                ans.append(row.substring(0, row.length() - 1));
            }
            ans.append('\n');
        }
        out.print(ans);

        out.close();
    }
}
