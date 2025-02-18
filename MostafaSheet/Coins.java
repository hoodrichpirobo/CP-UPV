import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String[] cond = new String[3];
        StringBuilder sb;
        int a = 0, b = 0, c = 0;
        for(int i = 0; i < 3; i++){
            sb = new StringBuilder(in.readLine());
            if(sb.charAt(1) == '<') cond[i] = sb.reverse().toString();
            else cond[i] = sb.toString();

            if(cond[i].charAt(0) == 'A') a++;
            if(cond[i].charAt(0) == 'B') b++;
            if(cond[i].charAt(0) == 'C') c++;
        }

        StringBuilder ans = new StringBuilder();
        if(a == 0){
            ans.append('A');
        }else if(b == 0){
            ans.append('B');
        }else if(c == 0){
            ans.append('C');
        }

        if(a == 1){
            ans.append('A');
        }else if(b == 1){
            ans.append('B');
        }else if(c == 1){
            ans.append('C');
        }

        if(a == 2){
            ans.append('A');
        }else if(b == 2){
            ans.append('B');
        }else if(c == 2){
            ans.append('C');
        }

        if(ans.length() == 3){
            out.println(ans);
        }else{
            out.println("Impossible");
        }

        out.close();
    }
}
