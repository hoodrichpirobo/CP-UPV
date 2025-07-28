import java.io.*;
import java.util.*;

public class Main{
  static Scanner in;
  static PrintWriter out;

  public static void main(String[] args) throws Exception {
    in = new Scanner(new FileReader("input.in"));
    out = new PrintWriter(System.out);

    int i = 0, max = Integer.MIN_VALUE;
    int[] arr = new int[30000];
    String line;
    while(in.hasNext()){
      line = in.nextLine();
      if(line.equals("")){
        max = Math.max(max, arr[i]);
        i++;
        continue;
      }
      arr[i] += Integer.parseInt(line);
    }
    max = Math.max(max, arr[i]);

    out.println(max);

    out.close();
  }
}
