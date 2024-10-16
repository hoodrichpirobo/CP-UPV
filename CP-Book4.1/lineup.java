import java.io.*;
import java.util.*;

public class lineup{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.readLine());
        String[] n = new String[N];
        boolean inc = false, dec = false;
        for(int i = 0; i < N; i++){
            n[i] = in.readLine();
            if(i > 0){
                inc = n[i - 1].compareTo(n[i]) < 0 ? true : inc;
                dec = n[i - 1].compareTo(n[i]) > 0 ? true : dec;
            }

            if(inc && dec) break;
        }

        if(inc && !dec){
            out.println("INCREASING");
        }else if(!inc && dec){
            out.println("DECREASING");
        }else{
            out.println("NEITHER");
        }

        out.close();
    }
}
