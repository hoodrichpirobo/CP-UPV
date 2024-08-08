import java.io.*;

public class quadrant{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int x = Integer.parseInt(in.readLine()),
            y = Integer.parseInt(in.readLine());
        if((x > 0) && (y > 0)){
            out.println(1);
        }else if((x < 0) && (y > 0)){
            out.println(2);
        }else if((x < 0) && (y < 0)){
            out.println(3);
        }else{
            out.println(4);
        }
        
        out.close();
    }
}
