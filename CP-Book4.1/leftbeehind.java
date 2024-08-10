import java.util.*;
import java.io.*;

public class leftbeehind{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        while(true){
            String line = in.readLine();
            if(line.equals("0 0")){
                break;
            }
            StringTokenizer tokens = new StringTokenizer(line);
        
            int x = Integer.parseInt(tokens.nextToken()),
                y = Integer.parseInt(tokens.nextToken());
            if((x+y) == 13){
                out.println("Never speak again.");
            }else if(x > y){
                out.println("To the convention.");
            }else if(x < y){
                out.println("Left beehind.");
            }else{
                out.println("Undecided.");
            }
        }

        out.close();
    }
}
