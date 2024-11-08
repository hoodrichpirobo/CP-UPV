import java.io.*;
import java.util.*;

public class hangingout{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int L = Integer.parseInt(tokens.nextToken()),
            x = Integer.parseInt(tokens.nextToken()),
            amount, ans = 0, terrace = 0;
        String action;
        while(x-->0){
            tokens = new StringTokenizer(in.readLine());
            action = tokens.nextToken();
            amount = Integer.parseInt(tokens.nextToken());
            switch(action){
                case "enter":
                    if((terrace + amount) > L){
                       ans++; 
                    }else{
                        terrace += amount;    
                    }
                    break;
                case "leave":
                    terrace -= amount;
                    break;
            }
        }
        out.println(ans);

        out.close();
    } 
}
