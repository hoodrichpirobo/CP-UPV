import java.util.*;
import java.io.*;

public class babybites{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int n = Integer.parseInt(in.readLine());
        String ans = "makes sense";
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        for(int i = 1; i <= n; i++){
            String word = tokens.nextToken();
            if(!word.equals("mumble")){
                int current = Integer.parseInt(word);
                if(current != i){
                    ans = "something is fishy";
                }
            }
        }
        out.println(ans);
        
        out.close();
    }
}
