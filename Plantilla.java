import java.util.*;

public class Template{
    
    static java.util.Scanner in;
    
    public static boolean testCase(){
        if(!in.hasNext())
            return false;
        else {
            
            return true;
        }
    }
    
    public static boolean testCase(){
        
        if()
            return false;
        else {
            
            return true;
        }
    }
    
    public static void testCase(){
        
    }
    
    public static void main(String[] args){
        
        in = new java.util.Scanner(System.in);
        
        int cases = in.nextInt();
        for(int i = 0; i < cases; i++)
            testCase();
        
        while(testCase()){}

    }
}
