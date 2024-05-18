// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class A {
    static Scanner in;

    public static void main(String[] args){
        in = new Scanner(System.in);

        int takaHeight = in.nextInt(), plantHeight = 0, i = 0;
        while(plantHeight <= takaHeight){
            plantHeight += Math.pow(2, i);
            i++;
        }

        System.out.println(i);
    }
}

//keep taking care of your goals,
//mental health, self care, recognize
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to
//ask 4 help or to fail at times.
