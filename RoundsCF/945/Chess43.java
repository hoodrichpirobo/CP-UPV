// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class Chess43 {
    static Scanner in;
   
    public static void testCase(){
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        
        if(c==0){
            System.out.println(0);      //this is pretty self explanatory
            return;
        }

        boolean isOdd = (a+b+c)%2!=0; 

        if(isOdd){
            System.out.println(-1);     //this was pretty weird for me to
                                        //understand but it's bc if u realize,
                                        //in each game either 0 or 2 points will
                                        //be added to a, b or c. Either by draw,
                                        //where 1 will added to both player one 
                                        //and two. Or by win, where one of them
                                        //will achieve 2 points. So that makes it
                                        //mandatory to be even in a possible scenario
            return;
        }

        int bestOutcome = (a+b+c)/2;      //given that we have understood that it always 
                                        //have to be even in order to be possible, we 
                                        //don't have to worry about doubles. This will
                                        //be the best outcome since after doing infinite 
                                        //combinations of draws between a, b and c, the 
                                        //half of their sum will always be the best 
                                        //outcome, meaning all of the games were draws
        
        int condition = a + b;          //now here comes what was the trickiest part 4 me
                                        //for these draws to be possible they need a pair
                                        //2 match with, i mean, each time we are either
                                        //making a draw either with a or b, so if their
                                        //sum is for example 4, it's impossible to have
                                        //more than 4 draws, meaning that if the bestOutcome
                                        //exceeds the condition, that's because there has 
                                        //been wons somewhere and the maximum draws is the
                                        //sum of the smallest ones, a and b (condition)
        if(condition<bestOutcome){
            System.out.println(condition);
        }else{
            System.out.println(bestOutcome);            // :') i promise i'll do better next time
        }
                                       
    }
    
    public static void main(String[] args){
        in = new Scanner(System.in);
        
        int testCase = in.nextInt();
        for(int i = 0; i < testCase; i++){
            testCase();
        }
    }
}
//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.

