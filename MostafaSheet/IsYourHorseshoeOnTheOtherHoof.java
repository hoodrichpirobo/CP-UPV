import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < 4; ++i){
            set.add(Integer.parseInt(tokens.nextToken()));
        }
        out.println(4 - set.size());

        out.close();
    }
}
