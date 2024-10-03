import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line = in.readLine();
        int delimiter = line.indexOf("|");
        String left = line.substring(0, delimiter),
               right = line.substring(delimiter + 1);
        line = in.readLine();

        for(int i = 0; i < line.length(); i++){
            if(left.length() <= right.length()){
                left += line.charAt(i);
            }else{
                right += line.charAt(i);
            }
        }
        out.println(left.length() == right.length() ? 
                left + "|" + right : "Impossible");
        
        out.close();
    }
}
