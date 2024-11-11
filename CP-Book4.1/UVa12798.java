import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        while((line = in.readLine()) != null && !line.isEmpty()){
            StringTokenizer tokens = new StringTokenizer(line);
            int N = Integer.parseInt(tokens.nextToken()),
                M = Integer.parseInt(tokens.nextToken()),
                count = 0;
            for(int i = 0; i < N; i++){
                tokens = new StringTokenizer(in.readLine());
                for(int j = 0; j < M; j++){
                    if(tokens.nextToken().charAt(0) == '0'){
                        count++;
                        break;
                    }
                }
            }
            out.println(N - count);
        }

        out.close();
    }
}
