// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static Scanner in;
    
    public static long testCase(){
        long inMoney = in.nextLong(), years = in.nextLong();
        
        for(int j = 0; j < years; j++){
            if(inMoney*2>inMoney+1000){
                inMoney *= 2;
            }else{
                inMoney += 1000;
            }
        }
        
        return inMoney;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i = 0; i < testCases; i++){
            System.out.println(testCase());
        }
	}
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
