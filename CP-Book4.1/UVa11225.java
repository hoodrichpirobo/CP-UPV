import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        int m = Integer.parseInt(in.readLine()),
            oudlers = 0;
        double points = 0;
        String line;
        for(int j = 0; j < m; j++){
            line = in.readLine();
            if(line.equals("fool") || line.endsWith("one of trumps")){
                oudlers++;
                points += 4.5;
                continue;
            }
            if(line.startsWith("king")) points += 4.5;
            else if(line.startsWith("queen")) points += 3.5;
            else if(line.startsWith("knight")) points += 2.5;
            else if(line.startsWith("jack")) points += 1.5;
            else points += 0.5;
        }

        int req = 56;
        if(oudlers == 3) req = 36;
        if(oudlers == 2) req = 41;
        if(oudlers == 1) req = 51;
        
        if(points < req) return ("Game lost by " + ((int)(req - points)) + " point(s).\n");
        else return ("Game won by " + ((int)(points - req)) + " point(s).\n");
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i <= TC; i++){
            if(i > 1) ans.append('\n');
            ans.append("Hand #").append(i).append('\n');
            ans.append(solve());
        }
        out.print(ans);

        out.close();
    }
}
