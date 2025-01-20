import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        int N = Integer.parseInt(in.readLine());
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int mile = 0, juice = 0, call;

        while(N-->0){
            call = Integer.parseInt(tokens.nextToken());
            mile += ((call/30 + 1)*10);
            juice += ((call/60 + 1)*15);
        }

        if(mile > juice){
            return ": Juice " + juice + "\n";
        }else if(mile < juice){
            return ": Mile " + mile + "\n";
        }

        return ": Mile Juice " + mile + "\n";
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i <= TC; i++){
            ans.append("Case ").append(i).append(solve());
        }
        out.print(ans);

        out.close();
    }
}
