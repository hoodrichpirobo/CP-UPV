import java.util.*;
import java.io.*;

public class cetiri{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(tokens.nextToken()),
            b = Integer.parseInt(tokens.nextToken()),
            c = Integer.parseInt(tokens.nextToken()), aux;
        if(a > b){
            aux = b;
            b = a;
            a = aux;
        }

        if(a > c){
            aux = c;
            c = a;
            a = aux;
        }

        if(b > c){
            aux = c;
            c = b;
            b = aux;
        }

        if(b - a > c - b){
            out.println(a + (c - b));
        }else if(b - a < c - b){
            out.println(b + (b - a));
        }else{
            out.println(c + (c - b));
        }

        out.close();
    }
}
