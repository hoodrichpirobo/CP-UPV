import java.io.*;
import java.util.*;

public class shuffling{
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }

    public static int[] shuffleMapping(int n, String line){
        int[] mapping = new int[n];

        if(line.equals("out")){
            int leftHalf = (n + 1) / 2;

            for(int i = 0; i < leftHalf; i++){
                mapping[i] = 2*i;
            }

            for(int i = leftHalf; i < n; i++){
                int j = i - leftHalf;
                mapping[i] = 2 * j + 1;
            }
        } else if (line.equals("in")){
            int leftHalf = n / 2;

            for(int i = 0; i < leftHalf; i++){
                mapping[i] = 2 * i + 1;
            }

            for(int i = leftHalf; i < n; i++){
                int j = i - leftHalf;
                mapping[i] = 2 * j;
            }
        }

        return mapping;
    }

    public static int countShuffles(int n, String line){
        int[] mapping = shuffleMapping(n, line);
        boolean[] visited = new boolean[n];
        int answer = 1;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                int cycleLength = 0, j = i;
                while(!visited[j]){
                    visited[j] = true;
                    j = mapping[j];
                    cycleLength++;
                }
                answer = lcm(answer, cycleLength);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken());
        String line = tokens.nextToken();

        out.println(countShuffles(n, line));

        out.close();
    }
}
