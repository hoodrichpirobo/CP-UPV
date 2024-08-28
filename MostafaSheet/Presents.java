import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        int[] i = new int[n];
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        
        for(int j = 0; j < n; j++){
            i[Integer.parseInt(tokens.nextToken()) - 1] = j + 1;
        }

        for(int k = 0; k < n; k++){
            out.print(i[k] + " ");
        }

        out.close();
    }
}
