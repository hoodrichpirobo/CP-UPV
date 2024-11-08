import java.io.*;
import java.util.*;

public class pokerhand{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        Map<Character, Integer> firstMap = new HashMap<>();
        String str;
        char first, second;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++){
            str = tokens.nextToken();
            first = str.charAt(0);
            firstMap.put(first, firstMap.getOrDefault(first, 0) + 1);
            max = Math.max(max, firstMap.get(first));
        }
        out.println(max);

        out.close();
    }
}
