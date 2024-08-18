import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static void solve() throws Exception {
        int f = Integer.parseInt(in.readLine()),
            cost = 0;
        for(int i = 0; i < f; i++){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int size = Integer.parseInt(tokens.nextToken()),
                animals = Integer.parseInt(tokens.nextToken()),
                eco = Integer.parseInt(tokens.nextToken());
            
            cost += Math.ceil(((double)size/animals)*eco*animals);
        }
        out.println(cost);
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        while(TC-->0){
            solve();
        }

        out.close();
    }
}
