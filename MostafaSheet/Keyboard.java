import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    
    String perfectLines = "qwertyuiopasdfghjkl;zxcvbnm,./";
    int diff = 1;
    if(in.readLine().equals("R")){
      diff = -1;
    }
    char[] c = in.readLine().toCharArray();
    for(int i = 0; i < c.length; i++){
      out.print(perfectLines.charAt(perfectLines.indexOf(c[i]) + diff));
    }

    out.close();
  }
}
