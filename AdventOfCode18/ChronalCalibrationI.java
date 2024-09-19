import java.io.*;

public class ChronalCalibration{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("input.in"));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        long sum = 0;
        while((line = in.readLine()) != null && !line.isEmpty()){
            line = line.trim();
            if(line.charAt(0) == '+'){
                sum += Integer.parseInt(line.substring(1));
            }else if(line.charAt(0) == '-'){
                sum -= Integer.parseInt(line.substring(1));
            }
                
        }
        out.println(sum);

        out.close();
    }
}
