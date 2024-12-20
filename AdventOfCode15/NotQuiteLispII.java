import java.io.*;
import java.util.*;

public class NotQuiteLisp{
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("input.in");
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

                if(ans <= -1){
                    ans = i + 1;
                    break;
                }
            }
        }
        out.println(ans);

        out.close();
    }
}
