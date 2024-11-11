import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        int n = Integer.parseInt(in.readLine()),
            count = 0;
        String ans = "Yay! Mighty Rafa persists!";
        for(int i = 1; i <= n; i++){
            if(!in.readLine().equals("W") && ans.length() > 25){
                count++;
                if(count == 3){
                    ans = Integer.toString(i);
                }
            }else{
                count = 0;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        for(int i = 1; i <= TC; i++){
            out.printf("Case %d: %s\n", i, solve());
        }

        out.close();
    }
}
