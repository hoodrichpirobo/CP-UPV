import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int k = Integer.parseInt(tokens.nextToken()),
            r = Integer.parseInt(tokens.nextToken());
        for(int i = 1; i <= 10; i++){
            int p = k*i;
            if((p%10 == 0) || (p%10 == r)){
                out.println(i);
                break;
            }
        }

        out.close();
    }
}
