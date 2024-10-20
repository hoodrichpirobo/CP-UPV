import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        char[] x = in.readLine().toCharArray();
        int t;
        for(int i = 0; i < x.length; i++){
            t = x[i] - '0';
            if(t > 4 && !((9 - t == 0) && (i == 0))){
                out.print(9 - t);
            }else{
                out.print(t);
            }
        }

        out.close();
    }
}
