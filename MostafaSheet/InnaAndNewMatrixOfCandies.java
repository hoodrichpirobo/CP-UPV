import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            m = Integer.parseInt(tokens.nextToken()),
            d, c, ans = -1;
        String line;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            line = in.readLine();
            d = line.indexOf('G');
            c = line.indexOf('S');
            if(d < c){
                set.add(c - d);
                ans = set.size();
            }else{
                ans = -1;
                break;
            }
        }

        out.println(ans);
        
        out.close();
    }
}
