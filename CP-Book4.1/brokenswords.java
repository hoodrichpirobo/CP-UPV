import java.util.*;
import java.io.*;

public class brokenswords{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.readLine()),
            a = 0, b = 0;
        char[] arr;
        for(int i = 0; i < N; i++){
            arr = in.readLine().toCharArray();
            a += (((arr[0] - '0') == 0 ? 1 : 0) + ((arr[1] - '0') == 0 ? 1 : 0));
            b += (((arr[2] - '0') == 0 ? 1 : 0) + ((arr[3] - '0') == 0 ? 1 : 0));
        }


        int swords = Math.min(a/2, b/2);
        out.print(swords + " ");
        if(swords > 0){
            out.print((a - 2 * swords) + " " + (b - 2 * swords));
        }else {
            out.print(a + " " + b);
        }

        out.close();
    }
}
