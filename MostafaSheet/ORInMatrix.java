import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int m = Integer.parseInt(tokens.nextToken()),
            n = Integer.parseInt(tokens.nextToken());
        int[][] B = new int[m][n];
        int[][] A = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                A[i][j] = 1;
            }
        }

        for(int i = 0; i < m; i++){
            tokens = new StringTokenizer(in.readLine());
            for(int j = 0; j < n; j++){
                B[i][j] = Integer.parseInt(tokens.nextToken());
                if(B[i][j] == 0){
                    for(int k = 0; k < n; k++){
                        A[i][k] = 0;
                    }
                    for(int k = 0; k < m; k++){
                        A[k][j] = 0;
                    }
                }
            }
        }

        boolean coincides = true;
        int max;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                max = Integer.MIN_VALUE;
                for(int k = 0; k < n; k++){
                    max = Math.max(max, A[i][k]);
                }
                for(int k = 0; k < m; k++){
                    max = Math.max(max, A[k][j]);
                }
                if(B[i][j] != max){
                    coincides = false;
                    break;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        if(!coincides){
            ans.append("NO\n");
        }else{
            ans.append("YES\n");
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(j > 0) ans.append(" ");
                    ans.append(A[i][j]);
                }
                ans.append('\n');
            }
        }
        out.print(ans);

        out.close();
    }
}
