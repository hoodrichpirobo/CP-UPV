import java.util.*;
import java.io.*;

public class tarifa{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        int X = Integer.parseInt(in.readLine()),
            N = Integer.parseInt(in.readLine()),
            T = X;
        while(N-->0){
            T -= Integer.parseInt(in.readLine());
            T += X;
        }
        out.println(T);
        
        out.close();
    }
}
