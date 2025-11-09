import java.io.*;

public class code {
  public static long solve(long i) {
    long a = (i * i * ((i * i) - 1))/2,
         b = 4 * ((i-1) * (i - 2));
    return a - b;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    long n = Long.parseLong(in.readLine());
    for(int i = 1; i <= n; i++){
      out.println(solve(i));
    }

    out.close();
  }
}
