import java.io.*;
import java.util.*;

public class bela{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(tokens.nextToken());
        char B = tokens.nextToken().charAt(0);

        Map<Character, Integer> dominant = new HashMap<>();
        Map<Character, Integer> notDominant = new HashMap<>();
        char[] numbers = {'A', 'K', 'Q', 'J', 'T', '9', '8', '7'};
        int[] dominantValues = {11, 4, 3, 20, 10, 14, 0, 0};
        int[] notDominantValues = {11, 4, 3, 2, 10, 0, 0, 0};

        for(int i = 0; i < numbers.length; i++){
            dominant.put(numbers[i], dominantValues[i]);
            notDominant.put(numbers[i], notDominantValues[i]);
        }

        int sum = 0;
        String line;
        for(int i = 0; i < 4*N; i++){
            line = in.readLine();
            if(line.charAt(1) == B) sum += dominant.get(line.charAt(0));
            else sum += notDominant.get(line.charAt(0));
        }
        out.println(sum);

        out.close();
    }
}
