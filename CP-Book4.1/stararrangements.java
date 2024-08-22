import java.io.*;

public class stararrangements{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int S = Integer.parseInt(in.readLine());
        out.println(S + ":");
        for(int i = 2; i <= Math.round((double)S/2); i++){
            int j = i - 1;
            if((S%(i+j) == i) || (S%(i+j) == 0)){
                out.println(i + "," + j);
            }
            if(S%i == 0){
                out.println(i + "," + i);
            }
        }
        
        out.close();
    }
}
