import java.util.*;
import java.io.*;

public class NoTimeForATaxiCab{
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("input.in");
        BufferedReader in = new BufferedReader(file);
        PrintWriter out = new PrintWriter(System.out);

        String line;
        while((line = in.readLine()) != null && !line.isEmpty()){
            String[] parts = line.split(", ");
            int n = parts.length,
                x = 0,
                y = 0,
                dist;
            String dir = "N";
            
            for(int i = 0; i < n; i++){
                dist = Integer.parseInt(parts[i].substring(1));
                if(parts[i].charAt(0) == 'R'){                    
                    if(dir.equals("N")){
                        x += dist;
                        dir = "E";
                    }else if(dir.equals("E")){
                        y -= dist;
                        dir = "S";
                    }else if(dir.equals("S")){
                        x -= dist;
                        dir = "W";
                    }else if(dir.equals("W")){
                        y += dist;
                        dir = "N";
                    }
                }else if(parts[i].charAt(0) == 'L'){
                    if(dir.equals("N")){
                        x -= dist;
                        dir = "W";
                    }else if(dir.equals("W")){
                        y -= dist;
                        dir = "S";
                    }else if(dir.equals("S")){
                        x += dist;
                        dir = "E";
                    }else if(dir.equals("E")){
                        y += dist;
                        dir = "N";
                    }
                }
            }
           
            out.println(Math.abs(x) + Math.abs(y));
        }

        out.close();
    }
}
