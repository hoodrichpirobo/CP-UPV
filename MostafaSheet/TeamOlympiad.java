import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()), t;
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int[] p = new int[n];
        int[] m = new int[n];
        int[] e = new int[n];
        int Pi = 0, Mi = 0, Ei = 0; 
        for(int i = 0; i < n; i++){
            t = Integer.parseInt(tokens.nextToken());
            switch(t){
                case 1:
                    p[Pi++] = i + 1;
                    break;
                case 2:
                    m[Mi++] = i + 1;
                    break;
                case 3:
                    e[Ei++] = i + 1;
                    break;
            }
        }

        int w = Math.min(Math.min(Pi, Mi), Ei);
        out.println(w);

        for(int i = 0; i < w; i++){
            out.println(p[i] + " " + m[i] + " " + e[i]);
        }

        out.close();
    }
}
