import java.util.*;
import java.io.*;

public class Solution{
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        String str = in.readLine();

        int AntonCount = 0;
        for(int i = 0; i < n; ++i){
            char ch = str.charAt(i);
            if(ch == 'A'){
                AntonCount++;
            }
        }

        if(AntonCount == (n/2) && (n%2 == 0)){
            out.println("Friendship");
        }else if((n/2) >= AntonCount){
            out.println("Danik");
        }else{
            out.println("Anton");
        }

        out.close();
    }
}
