// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class B{
    static Scanner in;

    public static void main(String[] args){
        in = new Scanner(System.in);

        int sizeA = in.nextInt(), sizeB = in.nextInt();
        int[] A = new int[sizeA];
        int[] B = new int[sizeB];
        int sizeC = sizeA + sizeB;
        int[] C = new int[sizeC];
        
        for(int i = 0; i < sizeA; i++){
            A[i] = in.nextInt();
            C[i] = A[i];
        }

        for(int j = 0; j < sizeB; j++){
            int i = j + sizeA;
            B[j] = in.nextInt();
            C[i] = B[j];
        }

        Arrays.sort(C);
        Arrays.sort(A);

        if(occurConsecutively(A,C)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean occurConsecutively(int[] A, int[] C){
        for(int k = 0; k < C.length - 1; k++){
            boolean firstMatch = false;
            for(int x = 0; x < A.length - 1; x++){
                if(A[x] == C[k] && A[x + 1] == C[k + 1]){
                    return true;
                }
            }
        }
        return false;
    }
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
