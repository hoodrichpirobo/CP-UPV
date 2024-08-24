import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(tokens.nextToken()),
            K = Integer.parseInt(tokens.nextToken());
        tokens = new StringTokenizer(in.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(tokens.nextToken());
        }
       
        K = N - K; 
        int[] temp = new int[N];
        int j = 0;
        for(int i = K; i < N; i++){
            temp[j] = A[i];
            j++;
        }

        for(int i = 0; i < K; i++){
            temp[j] = A[i];
            j++;
        }

        for(int each : temp){
            out.print(each + " ");
        }

        out.close();
    }
}

