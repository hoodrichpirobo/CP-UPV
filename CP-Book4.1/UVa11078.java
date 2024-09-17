import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static void solve() throws Exception {
        int n = Integer.parseInt(in.readLine()),
            max = Integer.MIN_VALUE,
            maxIndex = 0,
            maxDiff = max,
            currentStudent;
        
        for(int i = 0; i < n; i++){
            currentStudent = Integer.parseInt(in.readLine());
            if(currentStudent > max && i != n - 1){
                max = currentStudent;
                maxIndex = i;
            }

            if(i > maxIndex || i == n - 1){
                maxDiff = Math.max(maxDiff, max - currentStudent);
            }
        }    

        out.println(maxDiff);
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
