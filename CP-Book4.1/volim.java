import java.util.*;
import java.io.*;

public class volim{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int K = Integer.parseInt(in.readLine()) - 1,
            N = Integer.parseInt(in.readLine()),
            T = 0;
        StringTokenizer tokens;
        char c;
        for(int i = 0; i < N; i++){
            tokens = new StringTokenizer(in.readLine());
            T += Integer.parseInt(tokens.nextToken());
            
            if(T >= 210){
                break;
            }

            c = tokens.nextToken().charAt(0);

            if(c == 'T'){
                K = (K + 1)%8;
            }
        }
        out.println(K + 1);

        out.close();
    }
}
