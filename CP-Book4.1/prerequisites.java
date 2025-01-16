import java.io.*;
import java.util.*;

public class prerequisites{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int k = Integer.parseInt(tokens.nextToken());

            if(k == 0){
                break;
            }

            int m = Integer.parseInt(tokens.nextToken());

            Set<Integer> set = new HashSet<>();
            tokens = new StringTokenizer(in.readLine());
            for(int i = 0; i < k; i++){
                set.add(Integer.parseInt(tokens.nextToken()));
            }

            String verdict = "";
            for(int i = 0; i < m; i++){
                tokens = new StringTokenizer(in.readLine());
                int c = Integer.parseInt(tokens.nextToken()),
                    r = Integer.parseInt(tokens.nextToken());
                for(int j = 0; j < c; j++){
                    if(set.contains(Integer.parseInt(tokens.nextToken()))){
                        r--;
                    }
                }
                if(r > 0){
                    verdict = "no\n";
                }
            }

            if(verdict.isEmpty()){
                verdict = "yes\n";
            }

            ans.append(verdict);
        }
        out.println(ans);

        out.close();
    }
}
