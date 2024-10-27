import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void solve() throws Exception {
        int n = Integer.parseInt(in.readLine()),
            pos = 0;
        String[] ins = new String[n];
        String line;
        
        for(int i = 0; i < n; i++){
            line = in.readLine();

            if(line.equals("RIGHT")){
                pos++;
                ins[i] = line;
            }else if(line.equals("LEFT")){
                pos--;
                ins[i] = line;
            }else{
                ins[i] = ins[Integer.parseInt(line.substring(8)) - 1];
                pos = ins[i].equals("RIGHT") ? pos + 1 : pos - 1; 
            }
        }

        out.println(pos);
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int T = Integer.parseInt(in.readLine());
        while(T-->0){
            solve();
        }

        out.close();
    }
}
