import java.io.*;

public class Main{
  static BufferedReader in;
  static PrintWriter out;

  public static double massToFuel(long mass) {
    double ans = (Math.floor(mass/3.0))-2;
    return ans;
  }

  public static void main(String args[]) throws Exception {
    in = new BufferedReader(new FileReader("input.in"));
    out = new PrintWriter(System.out);

    String line;
    double fuel = 0;
    while ((line = in.readLine()) != null && !line.isEmpty()) {
      fuel += massToFuel(Long.parseLong(line));
    }
    out.print(fuel);

    out.close();
  }
}
