import java.io.*;
import java.util.*;

public class deathtaxes{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int shares = 0, x, y;
        double avgcost = 0, total = 0, costs = 0, profit;
        String action;
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            action = tokens.nextToken();
            switch (action){
                case "buy":
                    x = Integer.parseInt(tokens.nextToken());
                    y = Integer.parseInt(tokens.nextToken());
                    costs += x*y;
                    shares += x;
                    avgcost = (double) costs / shares;

                    break;
                case "sell":
                    x = Integer.parseInt(tokens.nextToken());
                    y = Integer.parseInt(tokens.nextToken());
                    shares -= x;
                    costs -= x*y;
                
                    break;
                case "split":
                    x = Integer.parseInt(tokens.nextToken());
                    shares *= x;
                    avgcost /= x;
                    costs = shares*avgcost;

                    break;
                case "merge":
                    x = Integer.parseInt(tokens.nextToken());
                    shares /= x;
                    costs = x*avgcost*shares;
                    avgcost *= x;

                    break;
                case "die":
                    y = Integer.parseInt(tokens.nextToken());
                    if(y < avgcost){
                        profit = 0;
                    }else{
                        profit = (y - avgcost) * 0.3;
                    }
                    total = shares * (y - profit);

                    break;
            }
            if(action.equals("die")){
                out.println(total);
                break;
            }
        }

        out.close();
    }
}
