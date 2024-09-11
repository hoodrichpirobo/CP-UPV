import java.util.*;
import java.io.*;

public class mia{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer tokens;
        while(true){
            tokens = new StringTokenizer(in.readLine());
            int s0 = Integer.parseInt(tokens.nextToken()),
                s1 = Integer.parseInt(tokens.nextToken()),
                r0 = Integer.parseInt(tokens.nextToken()),
                r1 = Integer.parseInt(tokens.nextToken());
            
            if(s0 + s1 + r0 + r1 == 0){
                break;
            }
            
            int max = Math.max(s0, s1),
                min = Math.min(s0, s1);
            s0 = max; s1 = min;
            
            max = Math.max(r0, r1);
            min = Math.min(r0, r1);
            r0 = max; r1 = min;
            
            String strp1 = "" + s0 + s1, 
                    strp2 = "" + r0 + r1;

            int p1 = Integer.parseInt(strp1),
                p2 = Integer.parseInt(strp2);

            if(p1 == p2){
                out.println("Tie.");
            }else if(p1 == 21){
                out.println("Player 1 wins.");
            }else if(p2 == 21){
                out.println("Player 2 wins.");
            }else if(s0 == s1 && r0 != r1){
                out.println("Player 1 wins.");
            }else if(r0 == r1 && s0 != s1){
                out.println("Player 2 wins.");
            }else if(p1 > p2){
                out.println("Player 1 wins.");
            }else if(p2 > p1){
                out.println("Player 2 wins.");
            }
        }
        
        out.close();
    }
}
