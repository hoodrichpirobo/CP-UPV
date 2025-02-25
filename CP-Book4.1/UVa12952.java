import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        while((line = in.readLine()) != null && !line.isEmpty()){
            StringTokenizer tokens = new StringTokenizer(line);
            int A = Integer.parseInt(tokens.nextToken()),
                B = Integer.parseInt(tokens.nextToken());
            out.println(Math.max(A, B));
        }

        out.close();
    }
}
