import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String line = in.readLine();
    int sum = 0;
    char c;
    line = line.substring(1, line.length() - 1);
    while(line.length()>0){
      c = line.charAt(0);
      line = line.replaceAll(c + "", "");
      if(Character.isLetter(c)){
        sum++;
      }
    }
    out.println(sum);


    out.close();
  }
}
