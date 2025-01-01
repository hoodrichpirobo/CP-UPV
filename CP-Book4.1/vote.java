import java.io.*;
import java.util.*;

public class vote{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        while(TC-->0){
            String verdict = "no winner\n";
            int max = Integer.MIN_VALUE, secondMax = max,
                maxIndex = 1, total = 0, vote,
                n = Integer.parseInt(in.readLine());
            for(int i = 0; i < n; i++){
                vote = Integer.parseInt(in.readLine());
                total += vote;
                
                if(max <= vote){
                    secondMax = max;
                    max = vote;
                    maxIndex = i + 1; 
                }
            }

            if(max != secondMax){
                if(max > total/2){
                    verdict = "majority winner ";
                }else{
                    verdict = "minority winner ";
                }
                verdict += (Integer.toString(maxIndex) + "\n");
            }
            ans.append(verdict);
        }
        out.print(ans);

        out.close();
    }
}
