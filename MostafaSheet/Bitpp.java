import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            x = 0;
        while(n-->0){
            String line = in.readLine();
            if(line.charAt(1) == '+'){
                x++;
            }else if(line.charAt(1) == '-'){
                x--;
            }
        }
        out.println(x);

        out.close();
    }
}
