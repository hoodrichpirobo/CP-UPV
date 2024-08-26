import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line = in.readLine().toLowerCase().replaceAll("[aeiouy]",""),
               ans = "";
        for(char each : line.toCharArray()){
            ans += "." + each;
        }
        out.println(ans);

        out.close();
    }
}
