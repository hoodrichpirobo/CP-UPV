import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String[] s = in.readLine().trim().split("\\+");
        int n = s.length, t = 3;
        int[] a = new int[t];
        for(int i = 0; i < n; i++){
           a[Integer.parseInt(s[i]) - 1]++; 
        }

        boolean first = true;
        for(int i = 0; i < t; i++){
            while(a[i]-->0){
                if(first){
                    out.print((i + 1));
                    first = false;
                }else{
                    out.print("+" + (i + 1));
                }
            }
        }

        out.close();
    }
}
