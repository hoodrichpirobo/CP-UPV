import java.util.*;
import java.io.*;

public class Main{
    static boolean areTheyIn(int input, int k){
        boolean[] check = new boolean[k + 1];

        while(input > 0){
            int dig = input%10;
            if(dig <= k){
                check[dig] = true;
            }
            input /= 10;
        }

        for(boolean each : check){
            if(!each){
                return each;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            k = Integer.parseInt(tokens.nextToken()),
            j = 0; 

        while(n-->0){
            int input = Integer.parseInt(in.readLine());
            if(areTheyIn(input, k)){
                j++;
            }
        }       
        out.println(j);

        out.close();
    }
}
