import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while((line = in.readLine()) != null && !line.isEmpty()){
            char[] arr1 = line.toCharArray();
            int[] arr2 = new int[arr1.length];
            int n = Integer.parseInt(in.readLine()), 
                l, r, last = 0;
            ans.append(String.format("Case %d:\n", ++i));

            for(int j = 1; j < arr1.length; j++){
                if(arr1[j] == arr1[j - 1]){
                    arr2[j] = last;
                }else{
                    last = j;
                    arr2[j] = last;
                }
            }

            while(n-->0){
                StringTokenizer tokens = new StringTokenizer(in.readLine());
                l = Integer.parseInt(tokens.nextToken());
                r = Integer.parseInt(tokens.nextToken());
                if(arr2[l] == arr2[r]){
                    ans.append("Yes\n");
                }else{
                    ans.append("No\n");
                }
            }
        }
        out.print(ans);

        out.close();
    }
}
