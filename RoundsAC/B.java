// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\ 
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class B {
    static Scanner in;
    
    public static void testCase(){
        in = new Scanner(System.in);
        String correct = in.nextLine();
        String incorrect = in.nextLine();
        int[] coincides = new int[correct.length()];

        for(int i = 0; i < correct.length(); i++){
            for(int j = i; j < incorrect.length(); j++){
                if(correct.charAt(i)==incorrect.charAt(j)){
                    coincides[i++] = j + 1;
                }
            }
        }

        for(int k = 0; k < coincides.length; k++){
            System.out.print(coincides[k] + " ");
        }
    }
    
    public static void main(String[] args){
        testCase();
    }
}
