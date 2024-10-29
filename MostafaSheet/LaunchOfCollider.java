import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            min = Integer.MAX_VALUE; 
        String line = in.readLine();
        
        if(line.contains("RL")){
            char[] dir = line.toCharArray();
            int[] arr = new int[n];

            StringTokenizer tokens = new StringTokenizer(in.readLine());
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(tokens.nextToken());
            }
            
            int k;
            for(int i = 1; i < n; i++){
                if(dir[i - 1] == 'R' && dir[i] == 'L'){
                    k = Math.abs(arr[i] - arr[i - 1]);
                    min = Math.min(min, k);
                }
            }

            out.println(min/2);
        }else{
            out.println(-1);
        }


        out.close();
    }
}
