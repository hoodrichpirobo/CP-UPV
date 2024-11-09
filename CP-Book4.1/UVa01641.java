import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        while((line = in.readLine()) != null && !line.isEmpty()){
            StringTokenizer tokens = new StringTokenizer(line);
            int h = Integer.parseInt(tokens.nextToken()),
                w = Integer.parseInt(tokens.nextToken());
            char[] arr;
            double count = 0;
            boolean inside;
            for(int i = 0; i < h; i++){
                arr = in.readLine().toCharArray();
                inside = false;
                for(int j = 0; j < w; j++){
                    if(arr[j] == '/' || arr[j] == '\\'){
                        count += 0.5;                     // Half a unit
                        inside = !inside;
                    }
                    if(inside && arr[j] == '.'){
                        count += 1;                     // entire unit
                    }
                }
            }
            out.println((int)count);
        }

        out.close();
    }
}
