import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            m = Integer.parseInt(tokens.nextToken());
        char c;
        StringBuilder ans = new StringBuilder("#Black&White");
        while(n-->0){
            tokens = new StringTokenizer(in.readLine());
            for(int i = 0; i < m; i++){
                c = tokens.nextToken().charAt(0);
                if(c == 'C' || c == 'M' || c == 'Y'){
                    ans = new StringBuilder("#Color");
                    n = 0;
                    break;
                }
            }
        }
        out.println(ans);

        out.close();
    }
}
