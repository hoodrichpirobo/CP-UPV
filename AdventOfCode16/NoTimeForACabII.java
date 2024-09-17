import java.util.*;
import java.io.*;

public class NoTimeForATaxiCab{
    static Set<String> coordinates;
    static String coordinate;
    static int x, y;
    static PrintWriter out;

    public static boolean allNewX(int from, int to){
        for(int i = from; i <= to; i++){
            coordinate = i + " " + y;
            if(coordinates.contains(coordinate)){
                x = i;
                return false;
            }else{
                coordinates.add(coordinate);
            }
        }
        return true;
    } 

    public static boolean allNewY(int from, int to){
        for(int i = from; i <= to; i++){
            coordinate = x + " " + i;
            if(coordinates.contains(coordinate)){
                y = i;
                return false;
            }else{
                coordinates.add(coordinate);
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("input.in");
        BufferedReader in = new BufferedReader(file);
        out = new PrintWriter(System.out);

        String line;
        while((line = in.readLine()) != null && !line.isEmpty()){
            String[] parts = line.split(", ");
            int n = parts.length,
                dist,
                prev;
            x = 0; y = 0;
            String dir = "N";
            coordinates = new HashSet<>();
            coordinate = "0 0";
            
            for(int i = 0; i < n; i++){
                dist = Integer.parseInt(parts[i].substring(1));
                if(parts[i].charAt(0) == 'R'){                    
                    if(dir.equals("N")){
                        prev = x + 1;
                        x += dist;
                        if(allNewX(prev, x)){
                            dir = "E";
                        }else{
                            break;
                        }
                    }else if(dir.equals("E")){
                        prev = y - 1;
                        y -= dist;
                        if(allNewY(y, prev)){
                            dir = "S";
                        }else{
                            break;
                        }
                    }else if(dir.equals("S")){
                        prev = x - 1;
                        x -= dist;
                        if(allNewX(x, prev)){
                            dir = "W";
                        }else{
                            break;
                        }                        
                    }else if(dir.equals("W")){
                        prev = y + 1;
                        y += dist;
                        if(allNewY(prev, y)){
                            dir = "N";
                        }else{
                            break;
                        }
                    }
                }else if(parts[i].charAt(0) == 'L'){
                    if(dir.equals("N")){
                        prev = x - 1;
                        x -= dist;
                        if(allNewX(x, prev)){
                            dir = "W";
                        }else{
                            break;
                        }                        
                    }else if(dir.equals("W")){
                        prev = y - 1;
                        y -= dist;
                        if(allNewY(y, prev)){
                            dir = "S";
                        }else{
                            break;
                        }
                    }else if(dir.equals("S")){
                        prev = x + 1;
                        x += dist;
                        if(allNewX(prev, x)){
                            dir = "E";
                        }else{
                            break;
                        }                                            
                    }else if(dir.equals("E")){
                        prev = y + 1;
                        y += dist;
                        if(allNewY(prev, y)){
                            dir = "N";
                        }else{
                            break;
                        }
                    }
                }
            }
            out.println(Math.abs(x) + Math.abs(y));
        }

        out.close();
    }
}
