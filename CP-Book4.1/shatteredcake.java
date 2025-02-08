import java.io.*;
import java.util.*;

public class shatteredcake{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int W = Integer.parseInt(in.readLine()),
            N = Integer.parseInt(in.readLine()),
            sum = 0;
        StringTokenizer tokens;
        for(int i = 0; i < N; i++){
            tokens = new StringTokenizer(in.readLine());
            sum += (Integer.parseInt(tokens.nextToken()) * Integer.parseInt(tokens.nextToken()));
        }

        out.println(sum/W);

        out.close();
    }
}
