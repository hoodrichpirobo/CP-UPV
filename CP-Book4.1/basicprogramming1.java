import java.io.*;
import java.util.*;

public class basicprogramming1{
    static BufferedReader in;
    static PrintWriter out;

    public static void cmpr(int[] A) throws Exception {
        if(A[0] > A[1]){
            out.println("Bigger");
        }else if(A[0] == A[1]){
            out.println("Equal");
        }else{
            out.println("Smaller");
        }
    }

    public static void median(int[] A) throws Exception {
        int[] ans = {A[0], A[1], A[2]};
        Arrays.sort(ans);
        out.println(ans[1]);
    }

    public static void sum(int[] A) throws Exception {
        long ans = 0;
        for(int each : A){
            ans += each;
        }
        out.println(ans);
    }
    
    public static void evenSum(int[] A) throws Exception {
        long ans = 0;
        for(int each : A){
            if(each%2 == 0){
                ans += each;
            }
        }
        out.println(ans);
    }

    public static void turnToChar(int[] A) throws Exception {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < A.length; i++){
            ans.append((char)('a'+(A[i]%26)));
        }
        out.println(ans);
    }

    public static void indexing(int[] A) throws Exception {
        int i = 0;
        boolean[] B = new boolean[A.length];
        while(true){
            if(i >= A.length){
                out.println("Out");
                break;
            }else if(i == A.length - 1){
                out.println("Done");
                break;
            }else if(B[i]){
                out.println("Cyclic");
                break;
            }
            B[i] = true;
            i = A[i];
        }
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(tokens.nextToken()),
            t = Integer.parseInt(tokens.nextToken());
        tokens = new StringTokenizer(in.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(tokens.nextToken());
        }

        switch(t){
            case 1:
                out.println(7);
                break;
            case 2:
                cmpr(A);
                break;
            case 3:
                median(A);
                break;
            case 4:
                sum(A);
                break;
            case 5:
                evenSum(A);
                break;
            case 6:
                turnToChar(A);
                break;
            case 7:
                indexing(A);
                break;
        }

        out.close();
    }
}
