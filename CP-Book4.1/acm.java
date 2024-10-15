import java.io.*;
import java.util.*;

public class acm{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        StringTokenizer tokens;
        int c = 0, tt = 0;
        Map<String, Integer> map = new HashMap<>();
        while(true){
            line = in.readLine();

            if(line.equals("-1")){
                break;
            }

            tokens = new StringTokenizer(line);
            int t = Integer.parseInt(tokens.nextToken());
            line = tokens.nextToken();
            if(tokens.nextToken().equals("right")){
                if(map.containsKey(line)){
                    map.put(line, map.get(line) + t);
                }else{
                    map.put(line, t);
                }
                c++;
                tt += map.get(line);
            }else{
                if(map.containsKey(line)){
                    map.put(line, map.get(line) + 20);
                }else{
                    map.put(line, 20);
                }
            }
        }
        out.println(c + " " + tt);

        out.close();
    }
}
