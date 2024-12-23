import java.util.*;
import java.io.*;

public class sevenwonders{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        char[] arr = in.readLine().toCharArray();
        int n = arr.length, t = 0, c = 0, g = 0, 
            sum, min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] == 'T'){
                t++;
            }else if(arr[i] == 'C'){
                c++;
            }else if(arr[i] == 'G'){
                g++;
            }

        }

        min = Math.min(t, Math.min(c, g));
        sum = (t*t) + (c*c) + (g*g); 
        if(t > 0 && c > 0 && g > 0){
            sum += (7*min);
        }
        out.println(sum);

        out.close();
    }
}
