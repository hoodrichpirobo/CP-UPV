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
    
    public static int testCase(){
        int games = in.nextInt();
        in.nextLine();
        String moves = in.nextLine();
        
        int sum = moves.length();
        boolean justReduced = false;
        
        for(int j = moves.length() - 1; j > 0; j--){
            if(justReduced){
                justReduced = false;
                continue;
            }
            if(moves.charAt(j)==moves.charAt(j - 1)){
                sum--;
                justReduced = true;
            }
        }
        return sum;
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
