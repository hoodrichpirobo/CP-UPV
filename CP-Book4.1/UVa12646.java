import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        Map<Integer, String> map = new HashMap<>();
        String line;
        while(((line = in.readLine()) != null) && !(line.isEmpty())){
            StringTokenizer tokens = new StringTokenizer(line);
            int A = Integer.parseInt(tokens.nextToken()),
                B = Integer.parseInt(tokens.nextToken()),
                C = Integer.parseInt(tokens.nextToken()),
                find = A + B + C;
            
            map.put(A, "A");
            map.put(B, "B");
            map.put(C, "C");

            if((find == 0) || (find == 3)){
                out.println("*");
            }else if(find == 1){
                out.println(map.get(1));
            }else if(find == 2){
                out.println(map.get(0));
            }
        }

        out.close();
    }
}
