import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        char[] line = in.readLine().toCharArray();
        int neighboring = 0;
        
        for(int i = 1; i < n; ++i){
            if(line[i - 1] == line[i]){
                neighboring++;
            }
        }

        out.println(neighboring);

        out.close();
    }
}
