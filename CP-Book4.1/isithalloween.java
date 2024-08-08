import java.io.*;

public class isithalloween{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        String line = in.readLine();
        if(line.equals("OCT 31") || line.equals("DEC 25")){
            out.println("yup");
        }else{
            out.println("nope");
        }
        
        out.close();
    }
}
