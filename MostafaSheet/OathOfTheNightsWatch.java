import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()), 
            min = Integer.MAX_VALUE, max = Integer.MIN_VALUE,
            current;
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++){
            current = Integer.parseInt(tokens.nextToken());
            max = Math.max(max, current);
            min = Math.min(min, current);
            map.put(current, map.getOrDefault(current, 0) + 1);
        }

        if(max == min){
            out.println(0);
        }else{
            out.println(n - map.get(max) - map.get(min));
        }

        out.close();
    }
}
