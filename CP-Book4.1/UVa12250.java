import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        Map<String,String> map = new HashMap<>();
        map.put("HELLO", "ENGLISH");
        map.put("HOLA", "SPANISH");
        map.put("BONJOUR", "FRENCH");
        map.put("HALLO", "GERMAN");
        map.put("CIAO", "ITALIAN");
        map.put("ZDRAVSTVUJTE", "RUSSIAN");
        int c = 0;

        while(true){
            String line = in.readLine();
            if(line.equals("#")){
                break;
            }
            out.printf("Case %d: %s\n", ++c, 
                        map.getOrDefault(line, "UNKNOWN"));
        }

        out.close();
    }
}
