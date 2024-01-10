import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    static java.util.Scanner in = new java.util.Scanner(System.in);
    
    public static boolean CasoDePrueba(){
        String line = in.nextLine();
        String[] points = line.split("\\s+");
        for(int i = points.length-1; i >= 2; i--){
            if(points[i].equals("W") && points[i-1].equals("W") && points[i-2].equals("W")){
                return true;
            }
        }
        return false;
    }
    
    public static void main (String[] args)
    {
        int t = in.nextInt();
        in.nextLine(); 
        
        for(int i = 0; i < t; i++){
            if(CasoDePrueba()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
