// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;
import java.lang.*;
import java.io.*;

class B
{
    static Scanner in;
    
    public static void testCase(){
        int x = in.nextInt(), y = in.nextInt();
        
        int max = -1;
        if(x>y){
            max = x;
        }else{
            max = y;
        }
        int draws = max%3;
        
        System.out.println(draws);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        for(int i = 0; i < testCases; i++){
            testCase();
        }
	}
}


//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
