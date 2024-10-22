import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            a = 0, b = 0;
        char[] l = in.readLine().toCharArray();
        for(int i = 0; i < n; i++){
            if(l[i] == '1'){
                a++;
            }else{
                b++;
            }
        }
        out.println(Math.abs(a - b));
        

        out.close();
    }
}
