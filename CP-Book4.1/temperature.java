import java.io.*;
import java.util.*;

// yn + x = n => n(y-1) = -x => n = x / (1 - y)

public class temperature{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int X = Integer.parseInt(tokens.nextToken()),   // A = mB + c --> 0 = mX + c
            Y = Integer.parseInt(tokens.nextToken());   // c = - mX ; 1 = mY --> m = 1/Y
            if(Y == 1 && X == 0){                       // A = (1/Y)B - (1/Y)X
                out.println("ALL GOOD");                // A = (1/Y)B - X/Y = B
            }else if(Y == 1){                           // B - (1/Y)B = - X/Y = B(1-(1/Y)) =
                out.println("IMPOSSIBLE");              // = B((Y-1)/Y) = - X/Y
            }else{                                      // B = (- X /Y)/((Y - 1) / Y) =
                out.printf("%.6f\n",(1.0*X/(1.0-Y)));   // B = (-XY)/((Y-1)Y) = -X/(Y-1)
            }                                           // B = X/(1-Y)
        
        out.close();
    }
}
