import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line = in.readLine();
        int sum = 0, value = 0;
        for(int i = 3; i < line.length(); i++){
            if(line.substring(i - 3, i + 1).equals("bear")){
                value = i - 2;
            }
            sum += value;
        }
        out.println(sum);

        out.close();
    }
}
