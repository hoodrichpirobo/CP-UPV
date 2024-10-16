import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        long n = Long.parseLong(in.readLine());
        if(n%2 == 0){
            out.println(n/2);
        }else{
            out.println(((n-1)/2) - n);
        }

        out.close();
    }
}
