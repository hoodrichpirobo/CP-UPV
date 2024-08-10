import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static void solve() throws Exception{
        String line = in.readLine(), decrypt = "";
      
        if(line.equals("1") || line.equals("4") || line.equals("78")){
            decrypt = "+";
        } else if (line.endsWith("35")){
            decrypt = "-";
        } else if (line.startsWith("9") && line.endsWith("4")) {
            decrypt = "*";
        } else if (line.startsWith("190")) {
            decrypt = "?";
        }
        
        out.println(decrypt);
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        while(TC-->0){
            solve();
        }

        out.close();
    }
}
