import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    double n = Integer.parseInt(in.readLine());
    int[] goals = new int[2];
    String a = "", b = "", goal;
    while(goals[0]<n/2 && goals[1]<n/2){
      goal = in.readLine();

      if(a.equals("") || a.equals(goal)){
        a = goal;
        goals[0]++;
      }else{
        b = goal;
        goals[1]++;
      }
    }

    out.println(goals[0] > goals[1] ? a : b);

    out.close();
  }
}
