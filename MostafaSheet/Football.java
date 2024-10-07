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

      if(a.equals("")){
        a = goal;
        goals[0]++;
        continue;
      }

      if(b.equals("") && !goal.equals(a)){
        b = goal;
        goals[1]++;
        continue;
      }

      if(goal.equals(a)){
        goals[0]++;
      }else{
        goals[1]++;
      }
    }
    goal = goals[0] > goals[1] ? a : b;
    out.println(goal);

    out.close();
  }
}
