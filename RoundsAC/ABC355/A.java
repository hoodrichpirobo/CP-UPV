// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class A{
    static Scanner in;

    public static void main(String[] args){
        in = new Scanner(System.in);

        int A = in.nextInt(), B = in.nextInt();
        boolean[] suspects = new boolean[3];

        for(int i = 0; i < 3; i++){
            if(A == i+1){
                suspects[i] = true;
            }
            if(B == i+1){
                suspects[i] = true;
            }
        }
        int countSuspects = 0, saveSuspect = 0;
        for(int j = 0; j < 3; j++){
            if(!suspects[j]){
                countSuspects++;
                saveSuspect = j + 1;
            }
        }
        if(countSuspects == 1){
            System.out.println(saveSuspect);
        }else{
            System.out.println(-1);
        }
    }
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
