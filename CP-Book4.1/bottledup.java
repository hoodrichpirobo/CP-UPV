import java.io.*;
import java.util.*;

public class bottledup{
    public static String solve(int s, int v1, int v2) {
        int countV1 = 0, countV2 = 0, auxS = s;
        while(auxS > 0){
            if(auxS%v1==0){
                countV1 = auxS/v1;
                auxS = 0;
            }else{
                auxS -= v2;
                countV2++;
            }
        }

        if(auxS == 0) return (countV1 + " " + countV2);
        else return "Impossible";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int s  = Integer.parseInt(tokens.nextToken()),
            v1 = Integer.parseInt(tokens.nextToken()),
            v2 = Integer.parseInt(tokens.nextToken());

        out.println(solve(s, v1, v2));

        out.close();
    }
}
