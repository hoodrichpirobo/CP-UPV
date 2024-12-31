import java.io.*;
import java.util.*;

public class peasoup{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        String ans = "Anywhere is fine I guess";
        while(n-->0){
            int k = Integer.parseInt(in.readLine());
            String name = in.readLine();
            Set<String> set = new HashSet<>();
            while(k-->0){
                set.add(in.readLine());
            }
            if(set.contains("pea soup") && set.contains("pancakes")){
                ans = name;
                break;
            }
        }
        out.println(ans);

        out.close();
    }
}
