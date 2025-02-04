import java.io.*;
import java.util.*;

public class codecleanups{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        int[] pushes = new int[n];
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++){
            pushes[i] = Integer.parseInt(tokens.nextToken());
        }

        int cleanupCount = 0,
            pending = 0,
            dirtiness = 0,
            pushIndex = 0;
        for(int day = 1; day <= 365; day++){
            if(day > 1){
                dirtiness += pending;
            }

            while(pushIndex < n && pushes[pushIndex] == day){
                pending++;
                pushIndex++;
            }

            if(day < 365 && dirtiness + pending >= 20){
                cleanupCount++;
                dirtiness = 0;
                pending = 0;
            }
        }

        if(pending > 0){
            cleanupCount++;
        }

        out.println(cleanupCount);

        out.close();
    }
}
