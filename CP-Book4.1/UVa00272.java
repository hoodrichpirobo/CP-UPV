import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        boolean open = true;
        
        while((line = in.readLine()) != null && !line.isEmpty()){
            for (char c : line.toCharArray()) {
                if (c == '"') {
                    if (open) {
                        out.print("``");
                    } else {
                        out.print("''");
                    }
                    open = !open;
                } else {
                    out.print(c);
                }
            }
            out.println();
        }

        out.close();
    }
}
