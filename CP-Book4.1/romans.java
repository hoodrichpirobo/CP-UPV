import java.util.*;
import java.io.*;

public class romans{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        double romanPaces = Double.parseDouble(in.readLine()) 
                            * 1000 * (5280.0/4854);
        out.println(Math.round(romanPaces));
        
        out.close();
    }
}
