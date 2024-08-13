import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        while(((line = in.readLine()) != null) && !(line.isEmpty())){
            StringTokenizer tokens = new StringTokenizer(line);
            int P = Integer.parseInt(tokens.nextToken()),
                H = Integer.parseInt(tokens.nextToken()),
                O = Integer.parseInt(tokens.nextToken());

            if(H > (O - P)){
                out.println("Hunters win!");
            }else{
                out.println("Props win!");
            }
        }

        out.close();
    }
}
