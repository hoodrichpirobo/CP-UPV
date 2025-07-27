import java.io.*;

public class Main{
  static BufferedReader in;
  static PrintWriter out;

  public static void main(String[] args) throws Exception {
    in = new BufferedReader(new FileReader("input.in"));
    out = new PrintWriter(System.out);

    int prev = Integer.MAX_VALUE, curr, ans = 0;
    String line;
    while((line = in.readLine()) != null && !line.isEmpty()) {
      curr = Integer.parseInt(line);
      if(prev < curr) ans++;
      prev = curr;
    }

    out.println(ans);

    out.close();
  }
}
