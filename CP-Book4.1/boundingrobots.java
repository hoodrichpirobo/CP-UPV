import java.io.*;
import java.util.*;

public class boundingrobots{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int w = Integer.parseInt(tokens.nextToken()),
                l = Integer.parseInt(tokens.nextToken());

            if(w == 0 && l == 0){
                break;
            }

            String x;
            int n = Integer.parseInt(in.readLine()),
                posX1 = 0, posX2 = 0, posY1 = 0, posY2 = 0,
                y;
            while(n-->0){
                tokens = new StringTokenizer(in.readLine());
                x = tokens.nextToken();
                y = Integer.parseInt(tokens.nextToken());

                switch(x){
                    case "u":
                        posY1 += y;
                        posY2 = Math.min(posY2 + y, l - 1);
                        break;
                    case "d":
                        posY1 -= y;
                        posY2 = Math.max(posY2 - y, 0);
                        break;
                    case "r":
                        posX1 += y;
                        posX2 = Math.min(posX2 + y, w - 1);
                        break;
                    case "l":
                        posX1 -= y;
                        posX2 = Math.max(posX2 - y, 0);
                        break;
                }
            }

            ans.append("Robot thinks ").append(posX1).append(" ").append(posY1)
               .append("\nActually at ").append(posX2).append(" ").append(posY2)
               .append("\n\n");        
        }
        out.print(ans);

        out.close();
    }
}
