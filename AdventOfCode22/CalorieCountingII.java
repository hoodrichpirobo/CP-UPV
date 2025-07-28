import java.io.*;
import java.util.*;

public class Main{
  static Scanner in;
  static PrintWriter out;

  public static void main(String[] args) throws Exception {
    in = new Scanner(new FileReader("input.in"));
    out = new PrintWriter(System.out);

    int i = 0, ans = 0;
    int[] arr = new int[30000];
    String line;
    while(in.hasNext()){
      line = in.nextLine();
      if(line.equals("")){
        i++;
        continue;
      }
      arr[i] += Integer.parseInt(line);
    }
    Arrays.sort(arr);
    for(int j = 29999; j > 29996; j--){
      ans += arr[j];
    }

    out.println(ans);

    out.close();
  }
}
