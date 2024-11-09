import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tokens;
    static int n, oMedian;
    static List<Integer> list;

    public static void solve() throws Exception {
        n = Integer.parseInt(in.readLine());
        tokens = new StringTokenizer(in.readLine());
        list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(tokens.nextToken()));
        }

        Collections.sort(list);
        
        oMedian = (int)(Math.ceil((double)n/2)) - 1;

        out.println((list.lastIndexOf(list.get(oMedian)) - oMedian) + 1);
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
