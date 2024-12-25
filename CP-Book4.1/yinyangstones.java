import java.util.*;
import java.io.*;

public class yinyangstones{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        char[] arr = in.readLine().toCharArray();
        int w = 0, b = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'W'){
                w++;
            }else{
                b++;
            }
        }

        if(w == b){
            out.println(1);
        }else{
            out.println(0);
        }

        out.close();
    }
}
