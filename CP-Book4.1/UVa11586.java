import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        char[] arr = in.readLine().toCharArray();
        int m = 0, f = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'M'){
                m++;
            }else if(arr[i] == 'F'){
                f++;
            }
        }

        return m == f && m > 1? "LOOP\n" : "NO LOOP\n";
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        while(TC-->0){
            ans.append(solve());
        }
        out.print(ans);

        out.close();
    }
}
