import java.util.*;
import java.io.*;

public class hello{
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        out = new PrintWriter(System.out);
        
        out.println("Hello World!");
        
        out.close();
    }
}
