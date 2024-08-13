import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int c = 0;
        while(true){
            String line = in.readLine();
            if(line.equals("*")){
                break;
            }

            if(line.equals("Hajj")){
                out.printf("Case %d: Hajj-e-Akbar\n", ++c);
            }
            if(line.equals("Umrah")){
                out.printf("Case %d: Hajj-e-Asghar\n", ++c);
            }
        }

        out.close();
    }
}
