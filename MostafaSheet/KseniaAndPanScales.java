import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String left = "",
              right = "";
        char[] line = in.readLine().toCharArray();
        boolean delimeter = true;
        for(int i = 0; i < line.length; i++){
            if(line[i] == '|'){
                delimeter = false;
                continue;
            }

            if(delimeter){
                left += line[i];
            }else{
                right += line[i];
            }
        }

        line = in.readLine().toCharArray();
        int n = line.length,
            diff = Math.abs(left.length() - right.length()),
            j = 0;

        if(diff <= n){
            if(left.length() < right.length()){
                String aux = left;
                left = "";
                for(int i = 0; i < diff; i++){
                    left += line[i];
                    j++;
                }
                left += aux;
            }else if(right.length() < left.length()){
                for(int i = 0; i < diff; i++){
                    right += line[i];
                    j++;
                }
            }
        
            if(left.length() == right.length()){
                if((n-j)%2==0){
                    int half = (n-j)/2;
                    String aux = left;
                    left = "";
                    for(int i = j; i < half + j; i++){
                        left += line[i];
                    }
                    left += aux;

                    for(int i = half + j; i < n; i++){
                        right += line[i];
                    }

                    out.println(left + "|" + right);
                }else{
                    out.println("Impossible");
                }
            }
        }else{
            out.println("Impossible");
        } 
        
        out.close();
    }
}
