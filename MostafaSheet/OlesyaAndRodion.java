import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            t = Integer.parseInt(tokens.nextToken());

        StringBuilder ans = new StringBuilder();
        if(t == 10){
            if(n == 1){
                ans.append(-1);
            }else{
                ans.append(1);
                for(int i = 1; i < n; i++){
                    ans.append(0);
                }
            }
        }else{
            for(int i = 0; i < n; i++){
                ans.append(t);
            }
        }

        out.println(ans);

        out.close();
    }
}
