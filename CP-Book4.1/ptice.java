import java.util.*;
import java.io.*;

public class ptice{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.readLine()),
            a = 0, b = 0, c = 0, max;
        char[] arr = in.readLine().toCharArray();
        char[] adrian = {'A', 'B', 'C'};
        char[] bruno = {'B', 'A', 'B', 'C'};
        char[] goran = {'C', 'C', 'A', 'A', 'B', 'B'};
        for(int i = 0; i < N; i++){
            if(arr[i] == adrian[i%3]){
                a++;
            }
            if(arr[i] == bruno[i%4]){
                b++;
            }
            if(arr[i] == goran[i%6]){
                c++;
            }
        }

        max = Math.max(Math.max(a, b), c);
        out.println(max);

        if(a >= max){
            out.println("Adrian");
        }

        if(b >= max){
            out.println("Bruno");
        }

        if(c >= max){
            out.println("Goran");
        }

        out.close();
    }
}
