import java.io.*;

public class Main{
    public static int digitSum(String line){
        int sum = 0;
        if(line.length() == 1){
            return Integer.parseInt(line);
        }
        for(char each : line.toCharArray()){
            sum += (each - '0');
        }

        return digitSum(Integer.toString(sum));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        while(true){
            String line = in.readLine();
            
            if(line.equals("0")){
                break;
            }

            out.println(digitSum(line));    
        }

        out.close();
    }
}
