import java.io.*;

public class Main {
  static BufferedReader in;
  static PrintWriter out;

  public static int sum(char[] arr) {
    char a;
    String sum = "";
    for(int i = 0; i < arr.length; i++){
      a = arr[i];
      if(!Character.isLetter(a)){
        sum += a;
        break;
      }
    }

    for(int i = arr.length - 1; i >= 0; i--){
      a = arr[i];
      if(!Character.isLetter(a)){
        sum += a;
        break;
      }
    }

    return Integer.parseInt(sum);
  }

  public static void main(String[] args) throws Exception {
    in = new BufferedReader(new FileReader("input.in"));
    out = new PrintWriter(System.out);

    String line;
    char[] arr;
    int ans = 0;
    while((line = in.readLine()) != null && !line.isEmpty()){
      arr = line.toCharArray();
      ans += sum(arr);
    }
    out.print(ans);

    out.close();
  }
}
