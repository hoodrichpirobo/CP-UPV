import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    int n = Integer.parseInt(in.readLine()), p;
    Set<Integer> set = new HashSet<>();
    StringTokenizer tokens;
    String ans = "Oh, my keyboard!";
    for(int i = 0; i < 2; i++){
      tokens = new StringTokenizer(in.readLine());
      p = Integer.parseInt(tokens.nextToken());
      for(int j = 0; j < p; j++){
        set.add(Integer.parseInt(tokens.nextToken()));
        if(set.size() >= n){
          ans = "I become the guy.";
          break;
        }
      }
    }
    out.println(ans);

    out.close();
  }
}
