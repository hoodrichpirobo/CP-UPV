import java.io.*;

public class oddities{
    static BufferedReader in;
    static PrintWriter out;
    
    static void solve() throws Exception{
        int n = Integer.parseInt(in.readLine());
        if(n % 2 == 0){
            out.println(n + " is even");
        }else{
            out.println(n + " is odd");
        }
    }
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        int TC = Integer.parseInt(in.readLine());
        while(TC-->0){
            solve();
        }
        
        out.close();
    }
}
