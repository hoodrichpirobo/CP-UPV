import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            prev = 0,
            count = 0;
        while(n-->0){
            int i = Integer.parseInt(in.readLine());
            if(i != prev){
                count++;
                prev = i;
            }
        }
        out.println(count);

        out.close();
    }
}
