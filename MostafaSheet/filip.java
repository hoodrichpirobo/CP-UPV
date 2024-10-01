import java.io.*;
import java.util.*;

public class filip{
    public static String reverseString(String line){
        String reversedString = "";
        char[] s = line.toCharArray();
        for(int i = s.length - 1; i >= 0; i--){
            reversedString += s[i];
        }
        return reversedString;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int A = Integer.parseInt(reverseString(tokens.nextToken())),
            B = Integer.parseInt(reverseString(tokens.nextToken()));
        out.println(A > B ? A : B);
        
        out.close();
    }
}
