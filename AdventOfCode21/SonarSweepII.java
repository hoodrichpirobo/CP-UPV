import java.io.*;

public class Main{
  static BufferedReader in;
  static PrintWriter out;

  public static void main(String[] args) throws Exception {
    in = new BufferedReader(new FileReader("input.in"));
    out = new PrintWriter(System.out);

    int prev = Integer.MAX_VALUE, curr, 
        ans = 0, j = - 3;
    String line;
    int[] arr = new int[2000];
    while((line = in.readLine()) != null && !line.isEmpty()) {
      curr = Integer.parseInt(line);
      for(int i = j + 3; i > j; i--){
        if(i >= 0) arr[i] += curr;
        else continue;
      }
      j++;
    }

    for(int i = 0; i <= j; i++){
      curr = arr[i];
      if(prev < curr) ans++;
      prev = curr;
    }

    out.println(ans);

    out.close();
  }
}
