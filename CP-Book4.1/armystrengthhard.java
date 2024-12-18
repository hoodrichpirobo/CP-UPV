import java.util.*;
import java.io.*;

public class armystrengthhard{
    static BufferedReader in;
    static PrintWriter out;

    public static void solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int nG = Integer.parseInt(tokens.nextToken()),
            nM = Integer.parseInt(tokens.nextToken());
        long maxG = Integer.MIN_VALUE, 
             maxM = Integer.MIN_VALUE;

        tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < nG; i++){
            maxG = Math.max(Long.parseLong(tokens.nextToken()), maxG);
        }

        tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < nM; i++){
            maxM = Math.max(Long.parseLong(tokens.nextToken()), maxM);
        }

        if (maxM > maxG){
            out.println("MechaGodzilla");
        } else {
            out.println("Godzilla");
        }
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        while(TC--> 0){
            in.readLine();
            solve();
        }

        out.close();
    }
}
