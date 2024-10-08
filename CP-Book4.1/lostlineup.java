import java.io.*;
import java.util.*;

public class lostlineup{
  public static void main(String[] args) throws Exception{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    int n = Integer.parseInt(in.readLine()), pos;
    int[] d = new int[n];
    d[0] = 1;
    StringTokenizer tokens = new StringTokenizer(in.readLine());
    for(int i = 2; i <= n; i++){
      pos = Integer.parseInt(tokens.nextToken()) + 1;
      d[pos] = i;
    }
    
    for(int i = 0; i < n; i++){
      out.print(d[i] + " ");
    }

    out.close();
  }
}
