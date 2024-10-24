import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int x = Integer.parseInt(in.readLine());
        out.println(Integer.bitCount(x));

        out.close();
    }
}
