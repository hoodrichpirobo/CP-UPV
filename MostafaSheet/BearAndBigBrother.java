import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(tokens.nextToken()),
            b = Integer.parseInt(tokens.nextToken()),
            i = 0;
        while(a <= b){
            i++;
            a *= 3;
            b *= 2;
        }
        out.println(i);

        out.close();
    }
}
