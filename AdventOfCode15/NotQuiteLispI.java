import java.io.*;
import java.util.*;

public class NotQuiteLisp{
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("in.in");
        BufferedReader in = new BufferedReader(file);
        PrintWriter out = new PrintWriter(System.out);
    
        String line;
        int ans = 0;
        while((line = in.readLine()) != null && !line.isEmpty()){
            line = line.trim();
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == '('){
                    ans++;
                }else if(line.charAt(i) == ')'){
                    ans--;
                }
            }
        }
        out.println(ans);

        out.close();
    }
}
