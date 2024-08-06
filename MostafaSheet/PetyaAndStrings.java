import java.util.*;
import java.io.*;

public class Solution{
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        String str1 = in.readLine().toLowerCase();
        String str2 = in.readLine().toLowerCase();

        int n = str1.compareTo(str2);

        if(n < 0){
            out.println(-1);
        }else if(n > 0){
            out.println(1);
        }else{
            out.println(n);
        }

        out.close();
    }
}
