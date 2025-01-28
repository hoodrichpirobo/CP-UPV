import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static class Pair{
        int L, H;

        Pair(int L, int H){
            this.L = L;
            this.H = H;
        }

        boolean inRange(int P){
            return (L <= P && P <= H);
        }
    }

    public static String solve() throws Exception {
        int D = Integer.parseInt(in.readLine());
        Map<String, Pair> map = new HashMap<>();
        StringTokenizer tokens;
        String[] names = new String[D];
        for(int j = 0; j < D; j++){
            tokens = new StringTokenizer(in.readLine());
            names[j] = tokens.nextToken();
            map.put(names[j], new Pair(Integer.parseInt(tokens.nextToken()), Integer.parseInt(tokens.nextToken())));
        }

        int Q = Integer.parseInt(in.readLine()), P;
        String name, responses = "";
        for(int j = 0; j < Q; j++){
            P = Integer.parseInt(in.readLine());
            name = "";
            for(int k = 0; k < D; k++){
                if(map.get(names[k]).inRange(P)){
                    if(!name.isEmpty()) name = "UNDETERMINED";
                    else name = names[k];
                }
            }
            if(name.isEmpty()) name = "UNDETERMINED";
            responses += (name + '\n');
        }
        return responses;
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < TC; i++){
            if(i > 0) ans.append('\n');
            ans.append(solve());
        }
        out.print(ans);

        out.close();
    }
}
