import java.util.*;
import java.io.*;

public class thelastproblem{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        out.println("Thank you, " + in.readLine() + ", and farewell!");
        
        out.close();
    }
}
