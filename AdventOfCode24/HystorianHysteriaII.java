import java.io.*;
import java.util.*;

public class Main{
  static BufferedReader in;
  static PrintWriter out;

  public static void main(String[] args) throws Exception {    
    in = new BufferedReader(new FileReader("input.in"));
    out = new PrintWriter(System.out);

    String line;
    int[] arr1 = new int[1000];
    int[] arr2 = new int[100000];
    int i = 0;
    while((line = in.readLine()) != null && !line.isEmpty()){
      StringTokenizer tokens = new StringTokenizer(line);
      arr1[i] = Integer.parseInt(tokens.nextToken());
      arr2[Integer.parseInt(tokens.nextToken())]++;
      i++;
    }

    int sum = 0;

    for(int j = 0; j < 1000; j++){
      sum += (arr1[j] * arr2[arr1[j]]);
    }

    out.println(sum);

    out.close();
  }
}
