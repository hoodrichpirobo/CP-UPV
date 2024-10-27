import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        long n = Long.parseLong(tokens.nextToken()),
             x = Long.parseLong(tokens.nextToken()),
             d = 0, i = 0;
        String line;
        char sign;
        while(n-->0){
            line = in.readLine();
            d = Long.parseLong(line.substring(2));
            sign = line.charAt(0);
            if(sign == '-' && x < d){
                i++;
                continue;
            }else if(sign == '-'){
                x -= d;
            }else{
                x += d;
            }
        }
        out.println(x + " " + i);

        out.close();
    }
}
