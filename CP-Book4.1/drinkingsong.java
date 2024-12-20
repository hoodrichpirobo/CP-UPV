import java.util.*;
import java.io.*;

public class drinkingsong{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.readLine());
        String line = in.readLine();
        StringBuilder ans = new StringBuilder();

        for(int i = N; i > 0; i--){
            if(i > 2){
                ans.append(String.format("%d bottles of %s on the wall, %d bottles of %s.\n", i, line, i, line));
                ans.append(String.format("Take one down, pass it around, %d bottles of %s on the wall.\n\n", i - 1, line));
            }else if(i > 1){
                ans.append(String.format("%d bottles of %s on the wall, %d bottles of %s.\n", i, line, i, line));
                ans.append(String.format("Take one down, pass it around, %d bottle of %s on the wall.\n\n", i - 1, line));
            }else {
                ans.append(String.format("%d bottle of %s on the wall, %d bottle of %s.\n", i, line, i, line));
                ans.append(String.format("Take it down, pass it around, no more bottles of %s.\n", line));
            }
        }
        out.print(ans);

        out.close();
    }
}
