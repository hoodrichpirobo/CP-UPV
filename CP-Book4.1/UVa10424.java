import java.util.*;
import java.io.*;

public class Main{
    public static double getSum(String name){
        int firstSum = 0;
        name = name.toLowerCase().trim();
        for(char each : name.toCharArray()){
            if(Character.isLetter(each)){
                firstSum += (each - 96);
            }
        }

        String line = Integer.toString(firstSum);
        return getPercentage(line);
    }

    public static double getPercentage(String line){
        if(line.length() == 1){
            return Double.parseDouble(line);
        }else{
            int secondSum = 0;
            for(char each : line.toCharArray()){
                secondSum += (each - '0');
            }

            return getPercentage(Integer.toString(secondSum));
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String firstName, secondName;
        int sum;
        while((firstName = in.readLine()) != null && !(firstName.isEmpty())){
            secondName = in.readLine();
            
            double valueA = getSum(firstName);
            double valueB = getSum(secondName);

            if(valueA<=valueB){
                out.printf("%.2f %%\n", (valueA/valueB)*100);
            }else{
                out.printf("%.2f %%\n", (valueB/valueA)*100);
            }
        }

        out.close();
    }
}
