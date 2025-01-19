import java.io.*;
import java.util.*;

public class Main{
    public static boolean change(char c, char[] n){
        if(c == 'x' && n[0] == '-') return true;
        if(c == 'y' && n[0] == '+' && n[1] == 'y') return true;
        if(c == 'z' && n[0] == '+' && n[1] == 'z') return true;
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            int L = Integer.parseInt(in.readLine()), s = 1;

            if(L == 0){
                break;
            }

            StringTokenizer tokens = new StringTokenizer(in.readLine());
            char c = 'x';
            char[] n;

            for(int i = 1; i < L; i++){
                n = tokens.nextToken().toCharArray();

                if(n[0] == 'N') continue;
                if(change(c, n)) s = -s;

                if(c == 'x'){
                    c = n[1];
                }else if(c == 'y' && n[1] == 'y'){
                    c = 'x';
                }else if(c == 'z' && n[1] == 'z'){
                    c = 'x';
                }
            }

            ans.append(s > 0 ? '+' : '-').append(c).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
