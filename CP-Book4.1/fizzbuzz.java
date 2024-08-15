import java.util.*;
import java.io.*;

public class fizzbuzz{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int x = Integer.parseInt(tokens.nextToken()),
            y = Integer.parseInt(tokens.nextToken()),
            n = Integer.parseInt(tokens.nextToken());
        
        for(int i = 1; i <= n; i++){
            if((i % x == 0) && (i % y == 0)){
                out.println("FizzBuzz");
            }else if(i % x == 0){
                out.println("Fizz");
            }else if(i % y == 0){
                out.println("Buzz");
            }else{
                out.println(i);
            }
        }
        
        out.close();
    }
}
