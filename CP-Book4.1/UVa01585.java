import java.io.*;
import java.util.*;

public class Main{
  static BufferedReader in;
  static PrintWriter out;

  public static void solve() throws Exception {
    char[] line = in.readLine().toCharArray();
    char prev = 'X';
    int sum = 0, acum = 0;
    for(char each : line){
      if(each == 'O' && prev == 'X'){
        sum += 1;
        acum = 1;
      }else if(each == 'O' && prev == 'O'){
        acum += 1;
        sum += acum;
      }
      prev = each;
    }
    out.println(sum);
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
