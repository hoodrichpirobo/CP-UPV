import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        char[] a = tokens.nextToken().toCharArray();
        int k = Integer.parseInt(tokens.nextToken()),
            n = a.length;

        for(int i = 0; i < n && k > 0; i++){
            int limit = Math.min(n - 1, i + k), pos = i;
            char maxChar = a[i];
            
            for(int j = i + 1; j <= limit; j++){
                if(a[j] > maxChar){
                    maxChar = a[j];
                    pos = j;
                }
            }

            while(pos > i && k > 0){
                char temp = a[pos];
                a[pos] = a[pos - 1];
                a[pos - 1] = temp;
                pos--;
                k--;
            }
        }

        out.println(new String(a));

        out.close();
    }
}
