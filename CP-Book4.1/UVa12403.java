import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            sum = 0;
        while(n-->0){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            if(tokens.nextToken().equals("donate")){
                sum += Integer.parseInt(tokens.nextToken());
            }else{
                out.println(sum);
            }
        }

        out.close();
    }
}
