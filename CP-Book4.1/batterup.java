import java.io.*;
import java.util.*;

public class batterup{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        double sum = 0, quant = 0, each;
        for(int i = 0; i < n; i++){
            each = Double.parseDouble(tokens.nextToken());
            if(each >= 0){
                quant++;
                sum += each;
            }
        }
        out.println(sum/quant);

        out.close();
    }
}
