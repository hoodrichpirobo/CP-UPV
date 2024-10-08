import java.io.*;
import java.util.*;

public class Main{
  static BufferedReader in;
  static PrintWriter out;

  public static void solve() throws Exception {
    int n = Integer.parseInt(in.readLine());
    long t = 0;
    long[] a = new long[n];
    StringTokenizer tokens = new StringTokenizer(in.readLine());
    
    for(int i = 0; i < n; i++){
      a[i] = Long.parseLong(tokens.nextToken());
      t += a[i];
    }

    out.println(t - (2*a[n-2]));
  }

  public static void main(String[] args) throws Exception {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);

    int TC = Integer.parseInt(in.readLine());
    while(TC-->0){
      solve();
    }

    out.close();
  }
}
