import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        String line;
        while((line = in.readLine()) != null && !line.isEmpty()){
            out.println(line);
        }

        out.close();
    }
}
