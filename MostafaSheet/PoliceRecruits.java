import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()), cops = 0, undone = 0;
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        while(n-->0){
            cops += Integer.parseInt(tokens.nextToken());
            if(cops < 0){
                cops = 0;
                undone++;
            }
        }
        out.println(undone);

        out.close();
    }
}
