import java.util.*;
import java.io.*;

public class zanzibar{
    static BufferedReader in;
    static PrintWriter out;
    
    static void solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int newTurtles = 0,
            oldTurtles = 0,
            lowerBound = 0;
            
        while(tokens.hasMoreTokens()){
            newTurtles = Integer.parseInt(tokens.nextToken());
            if(newTurtles > (oldTurtles*2) && oldTurtles != 0){
                lowerBound += newTurtles - (oldTurtles * 2);
            }
            oldTurtles = newTurtles;
        }
        
        out.println(lowerBound);
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
