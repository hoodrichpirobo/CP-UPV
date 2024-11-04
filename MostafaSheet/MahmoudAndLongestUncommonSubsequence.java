import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String a = in.readLine(),
               b = in.readLine();
        if(a.equals(b)){
            out.println(-1);
        }else{
            int n = a.length(),
                m = b.length(),
                max = n > m ? n : m;
            out.println(max);
        }

        out.close();
    }
}
