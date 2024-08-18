import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        while(true){
            int k = Integer.parseInt(in.readLine());
            if(k == 0){
                break;
            }
            
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int N = Integer.parseInt(tokens.nextToken()),
                M = Integer.parseInt(tokens.nextToken());
            while(k-->0){
                tokens = new StringTokenizer(in.readLine());
                int X = Integer.parseInt(tokens.nextToken()),
                    Y = Integer.parseInt(tokens.nextToken());
                if(X == N || Y == M){
                    out.println("divisa");
                }else if(X > N && Y > M){
                    out.println("NE");
                }else if(X < N && Y > M){
                    out.println("NO");
                }else if(X < N && Y < M){
                    out.println("SO");
                }else if(X > N && Y < M){
                    out.println("SE");
                }
            } 
        }

        out.close();
    }
}
