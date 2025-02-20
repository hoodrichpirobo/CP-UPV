import java.io.*;
import java.util.*;

public class Main{
    public static String compare(List<Long> first, List<Long> second, String ans){
        int n = Math.min(first.size(), second.size());

        for(int i = 0; i < first.size(); i++){
            if(first.get(i) > second.get(i)) return "first";
            else if(first.get(i) < second.get(i)) return "second";
        }
        if(first.size() == second.size()) return ans;

        return first.size() > second.size() ? "first" : "second";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        long pointsFirst = 0, pointsSecond = 0;
        String ans = "";
        List<Long> first = new ArrayList<>();
        List<Long> second = new ArrayList<>();
        for(int i = 0; i < n; i++){
            long a = Long.parseLong(in.readLine());
            if(a > 0){
                ans = "first";
                pointsFirst += a;
                first.add(a);
            }else{
                ans = "second";
                a = Math.abs(a);
                pointsSecond += a;
                second.add(a);
            }
        }

        if(pointsFirst > pointsSecond) ans = "first";
        else if(pointsFirst < pointsSecond) ans = "second";
        else ans = compare(first, second, ans);

        out.println(ans);

        out.close();
    }
}
