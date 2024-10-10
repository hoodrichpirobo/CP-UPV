import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String line = in.readLine();
    Set<Character> set = new HashSet<>();
    char c;
    for(int i = 0; i < line.length(); i++){
      c = line.charAt(i);
      if(Character.isLetter(c)){
        set.add(c);
      }
    }
    out.println(set.size());


    out.close();
  }
}
