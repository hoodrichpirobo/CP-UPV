import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(tokens.nextToken()), b = Integer.parseInt(tokens.nextToken()),
            na, nb;
        boolean sorted = true, equal = (a == b);
        
        for(int i = 1; i < n; i++){
            tokens = new StringTokenizer(in.readLine());
            na = Integer.parseInt(tokens.nextToken()); nb = Integer.parseInt(tokens.nextToken());
            if(na != nb) equal = false;
            if(na > a || nb > b) sorted = false;
            a = na; b = nb;
        }
        
        out.println(!equal ? "rated" : (!sorted ? "unrated" : "maybe"));
        out.close();
    }
}
