import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            j = 0, min = Integer.MAX_VALUE, diffSize = 0; 
        String line = in.readLine();
        
        if(line.contains("RL")){
            int[] diff = new int[n - 1];
            for(int i = 0; i < n - 1; i++){
                if(line.substring(i, i + 2).equals("RL")){
                    diff[j] = i;
                    diffSize = j;
                    j++;
                }
            }

            j = 0;
            StringTokenizer tokens = new StringTokenizer(in.readLine());        
            for(int i = 0; i < n && j <= diffSize; i++){
                if(i == diff[j]){
                    diff[j] = Math.abs(Integer.parseInt(tokens.nextToken()) - Integer.parseInt(tokens.nextToken()));
                    min = Math.min(min, diff[j]);
                    j++;
                    i++;
                }else{
                    tokens.nextToken();
                }
            }
            out.println(min/2);
        }else{
            out.println(-1);
        }


        out.close();
    }
}
