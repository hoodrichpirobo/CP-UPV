import java.io.*;
import java.util.*;

public class ChronalCalibration{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("input.in"));
        PrintWriter out = new PrintWriter(System.out);

        String line, ans = "";
        long sum = 0;
        Set<Long> frequencies = new HashSet<>();
        List<Long> changes = new ArrayList<>();
        frequencies.add(sum);
        int i = 0;
        
        while((line = in.readLine()) != null && !line.isEmpty()){
            line = line.trim();

            changes.add(Long.parseLong(line));
            sum += changes.get(i);
            i++;

            if(frequencies.contains(sum)){
                ans = "First to reach twice is " + sum;
                break;  
            }else{
                frequencies.add(sum);
            }            
        }
        
        int n = i;
        i = 0;
        while(ans.isEmpty()){
            sum += changes.get(i);
            
            if(frequencies.contains(sum)){
                ans = "First to reach twice is " + sum;
                break;
            }else{
                frequencies.add(sum);
            }

            i++;
            if(i == n){
                i = 0;
            } 
        }
        
        out.println(ans);

        out.close();
    }
}
