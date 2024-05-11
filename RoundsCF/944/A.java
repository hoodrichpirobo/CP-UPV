// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class Solution{
    static Scanner in;

    public static void testCase(){
        int a = in.nextInt(), b = in.nextInt();
        int max = a;
        if(a<b){
            max = b;
        }else{
            a = b;
        }

        System.out.println(a + " " + max);
    }

    public static void main(String[] args){
        in = new Scanner(System.in);

        int testCases = in.nextInt();
        for(int i = 0; i < testCases; i++){
            testCase();
        }
    }
}
