// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\ 
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class A {
    static Scanner in;
    
    public static void testCase(){
        in = new Scanner(System.in);
        int n = in.nextInt(),
            x = in.nextInt(),
            y = in.nextInt(),
            z = in.nextInt();
        if(x>y){
            if(z < x && z > y){
                System.out.println("Yes");
                return;
            }
        }else if(y>x){
            if(z < y && z > x){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
    
    public static void main(String[] args){
        testCase();
    }
}
