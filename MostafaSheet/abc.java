import java.util.*;
import java.io.*;

public class abc{
    public static String print(int[] a, String line){
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('B', 1);
        map.put('C', 2);
        
        StringBuilder ans = new StringBuilder();
        for(char each : line.toCharArray()){
            ans.append(a[map.get(each)] + " ");
        }
        
        return ans.toString();
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = 3;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(tokens.nextToken());
        }

        Arrays.sort(a);
        out.println(print(a, in.readLine()));
        
        
        out.close();
    }
}
