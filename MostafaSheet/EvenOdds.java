import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        long n = Long.parseLong(tokens.nextToken()),
             k = Long.parseLong(tokens.nextToken()),
             oddCount = (n + 1)/ 2;

        if(k <= oddCount){                  // Odd part will be to the left side
            out.println(2*k-1);            // Which will yield twice k minus one, given that it's odd
        }else{                             // Even part will be to the right side
            out.println(2*(k-oddCount));  // Which will yield twice k minus the odd count
        }

        out.close();
    }
}
