import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder word = new StringBuilder(in.readLine());
        String translation = in.readLine();
        if(word.reverse().toString().equals(translation)){
            out.println("YES");
        }else{
            out.println("NO");
        }

        out.close();
    }
}
