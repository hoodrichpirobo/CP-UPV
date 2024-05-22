// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;
import java.lang.*;
import java.io.*;

class C
{
    static Scanner in;
    
    public static void testCase(){
        int size = in.nextInt();
        in.nextLine();
        String binaryStr = in.nextLine();
        int ones = 0, zeros = 0, bit = 0, last = 9;
        for(int j = 0; j < size; j++){
            bit = binaryStr.charAt(j) - '0';
            if(last != 0 && bit == 0){
                zeros++;
                last = bit;
            }else if(last != 1 && bit == 1){
                ones++;
                last = bit;
            }
        }
        int minChanges = (int) Math.min(zeros, ones);
        System.out.println(minChanges);
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
