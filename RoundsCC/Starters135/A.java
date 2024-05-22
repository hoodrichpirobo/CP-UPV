// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;
import java.lang.*;
import java.io.*;

class A
{
    static Scanner in;
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        in = new Scanner(System.in);
        
        int RCB = in.nextInt(), CSK = in.nextInt();
        
        if(RCB-CSK>=18){
            System.out.println("RCB");
        }else{
            System.out.println("CSK");
        }
	}
}


//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
