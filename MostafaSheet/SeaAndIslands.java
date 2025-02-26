import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            k = Integer.parseInt(tokens.nextToken()),
            count = 0;
        StringBuilder ans = new StringBuilder();
        if(k <= ((n*n) + 1)/2){
            ans.append("YES\n");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if((i+j)%2 == 0 && count < k){
                        ans.append('L');
                        count++;
                    }else{
                        ans.append('S');
                    }
                }
                ans.append('\n');
            }
        }else{
            ans.append("NO\n");
        }
        out.print(ans);

        out.close();
    }
}
