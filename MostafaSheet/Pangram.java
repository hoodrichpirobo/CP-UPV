import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        char[] Ci = in.readLine().toLowerCase().toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(Ci[i]);
        }

        if(set.size() >= 26){
            out.println("YES");
        }else {
            out.println("NO");
        }

        out.close();
    }
}
