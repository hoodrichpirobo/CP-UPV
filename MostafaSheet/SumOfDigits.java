import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line = in.readLine();
        int count = 0, sum;
        while(line.length() > 1){
            sum = 0;
            for(char each : line.toCharArray()){
                sum += (each - '0');
            }
            line = Integer.toString(sum);
            count++;
        }
        out.println(count);

        out.close();
    }
}
