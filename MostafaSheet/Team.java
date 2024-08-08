import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            sum = 0;
        while(n-->0){
            String line = in.readLine();
            switch(line){
                case "0 1 1":
                case "1 0 1":
                case "1 1 0":
                case "1 1 1":
                    ++sum;
                    break;
            }
        }
        out.println(sum);

        out.close();
    }
}
