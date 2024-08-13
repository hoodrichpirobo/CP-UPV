import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line = in.readLine();
        out.println(Character.toUpperCase(line.charAt(0)) + line.substring(1));

        out.close();
    }
}
