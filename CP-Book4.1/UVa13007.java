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
                ans = 0;
            while(M-->0){
                tokens = new StringTokenizer(in.readLine());

                int B = Integer.parseInt(tokens.nextToken()),
                    prevSum = 0, maxSum = 0, c; 
                for(int i = 0; i < N; i++){
                    c = Integer.parseInt(tokens.nextToken());
                    prevSum += c;
                    if(i>0){
                        maxSum += c;
                    }
                }

                if(prevSum > B) prevSum = maxSum;
                if(B-maxSum >= 10000){
                    ans += (maxSum - prevSum + 10000);
                }else if(B-maxSum >= 1000){
                    ans += (maxSum - prevSum + 1000);
                }else if(B-maxSum >= 100){
                    ans += (maxSum - prevSum + 100);
                }else if(B-maxSum >= 10){
                    ans += (maxSum - prevSum + 10);
                }else if(B-maxSum >= 1){
                    ans += (maxSum - prevSum + 1);
                }
            }
            out.println(ans);
        }

        out.close();
    }
}
