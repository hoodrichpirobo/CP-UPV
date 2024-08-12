import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        String line = in.readLine();
        int neighboring = 0;
        for(int i = 0; i < n - 1; ++i){
            if(line.charAt(i) == line.charAt(i+1)){
                neighboring++;
            }
        }
        out.println(neighboring);

        out.close();
    }
}
