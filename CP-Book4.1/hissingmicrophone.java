import java.io.*;

public class hissingmicrophone{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line = in.readLine();
        if(line.contains("ss")){
            out.println("hiss");
        }else{
            out.println("no hiss");
        }

        out.close();
    }
}
