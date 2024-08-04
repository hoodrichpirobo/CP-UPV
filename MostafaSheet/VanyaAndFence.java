import java.util.*;
import java.io.*;

class Solution{
    static BufferedReader br;
    static PrintWriter pw;

    static int testCase(int h, int[] heights){
        int totalWidth = 0;

        for(int each : heights){
            if(each > h){
                totalWidth += 2;
            }else{
                totalWidth++;
            }
        }

        return totalWidth;
    }

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        String[] token1 = br.readLine().split(" ");
        int n = Integer.parseInt(token1[0]),
            h = Integer.parseInt(token1[1]);
        String[] token2 = br.readLine().split(" ");
        int[] heights = new int[n];
        for(int i = 0; i < n; ++i){
            heights[i] = Integer.parseInt(token2[i]);
        }

        pw.println(testCase(h, heights));
        
        pw.close();
    }
}
