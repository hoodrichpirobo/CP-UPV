import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line = in.readLine();
        int caps = 0, lows = 0;
        for(char c : line.toCharArray()){
            if(Character.isUpperCase(c)){
                caps++;
            }else{
                lows++;
            }
        }
        if(caps>lows){
            out.println(line.toUpperCase());
        }else{
            out.println(line.toLowerCase());
        }

        out.close();
    }
}
