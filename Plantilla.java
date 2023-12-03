import java.util.*;

public class Plantilla{
    
    static java.util.Scanner in;
    
    public static boolean casoDePruebaIII(){
        if(!in.hasNext())
            return false;
        else {
            
            return true;
        }
    }
    
    public static boolean casoDePruebaII(){
        
        if()
            return false;
        else {
            
            return true;
        }
    }
    
    public static void casoDePruebaI(){
        
    }
    
    public static void main(String[] args){
        
        in = new java.util.Scanner(System.in);
        
        int numCasos = in.nextInt();
        for(int i = 0; i < numCasos; i++)
            casoDePruebaI();
        
        while(casoDePruebaIII()){
            
        }
    }
}
