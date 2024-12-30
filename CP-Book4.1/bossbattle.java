import java.io.*;

public class bossbattle{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int ans = Integer.parseInt(in.readLine()) - 2;
        out.print(ans < 1 ? 1 : ans);

        out.close();
    }
}
