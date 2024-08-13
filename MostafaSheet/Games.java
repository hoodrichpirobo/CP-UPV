import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;
    static int[][] teams;
    
    static void solve(){
        int size = teams.length,
            exceptions = 0;
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                if(teams[i][0] == teams[j][1]){
                    exceptions++;
                }
                if(teams[i][1] == teams[j][0]){
                    exceptions++;
                }
            }
        }

        out.println(exceptions);
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        teams = new int[TC][2];
        StringTokenizer tokens;
        while(TC-->0){
            tokens = new StringTokenizer(in.readLine());
            teams[TC][0] = Integer.parseInt(tokens.nextToken());
            teams[TC][1] = Integer.parseInt(tokens.nextToken());
        }

        solve();

        out.close();
    }
}
