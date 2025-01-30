import java.io.*;
import java.util.*;

public class anotherbrick{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int h = Integer.parseInt(tokens.nextToken()),
            w = Integer.parseInt(tokens.nextToken()),
            n = Integer.parseInt(tokens.nextToken()),
            currentH = 0, currentW = 0, x;
        tokens = new StringTokenizer(in.readLine());
        String ans;
        for(int i = 0; i < n; i++){
            x = Integer.parseInt(tokens.nextToken());
            currentW += x;
            if(currentW > w || currentH >= h){
                break;
            }else if(currentW == w){
                currentW = 0;
                currentH++;
            }
        }

        if(currentH >= h) out.println("YES");
        else out.println("NO");

        out.close();
    }
}
