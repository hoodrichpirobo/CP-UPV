import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;
    public static int solve() throws Exception {
        char[] S = in.readLine().toCharArray();
        char[] T = in.readLine().toCharArray();

        int cQ = 0, cQ0 = 0, cQ1 = 0,
            c01 = 0, c10 = 0;

        for(int j = 0; j < S.length; j++){
            if(S[j] == '?'){
                cQ++;
                if(T[j] == '0') cQ0++;
                else cQ1++;
            }else{
                if(S[j] == '0' && T[j] == '1') c01++;
                else if(S[j] == '1' && T[j] == '0') c10++;
            }
        }

        if(c10 > (cQ1 + c01)) return -1;
        return cQ + Math.max(c01, c10);
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new PrintWriter(System.out));

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i <= TC; i++){
            ans.append("Case ").append(i).append(": ").append(solve()).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
