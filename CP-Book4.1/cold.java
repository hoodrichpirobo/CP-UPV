import java.util.*;
import java.io.*;

public class cold{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int n = Integer.parseInt(in.readLine()),
            count = 0;
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        while(n-->0){
            if(Integer.parseInt(tokens.nextToken()) < 0){
                count++;
            }
        }
        out.println(count);
        
        out.close();
    }
}
