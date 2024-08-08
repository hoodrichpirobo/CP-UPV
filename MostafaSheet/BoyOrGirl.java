import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        String line = in.readLine();
        Set<Character> charSet = new HashSet<>();
        for(int i = 0; i < line.length(); ++i){
            charSet.add(line.charAt(i));
        }
        if(charSet.size() % 2 == 0){
            out.println("CHAT WITH HER!");
        }else{
            out.println("IGNORE HIM!");
        }

        out.close();
    }
}
