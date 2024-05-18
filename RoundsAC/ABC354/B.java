// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class B {
    static Scanner in; 

    public static void main(String[] args){
        in = new Scanner(System.in);

        int users = in.nextInt();
        in.nextLine();
        String[] names = new String[users];
        int[] rating = new int[users];

        for(int i = 0; i < users; i++){
            String[] parts = in.nextLine().split("\\s+");
            names[i] = parts[0];
            rating[i] = Integer.parseInt(parts[1]);
        }

        int sum = 0;
        for(int j = 0; j < users; j++){
            sum += rating[j];
        }

        Arrays.sort(names);

        System.out.println(names[sum%users]);
    }
}

//keep taking care of your goals,
//mental health, self care, recognize
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to
//ask 4 help or to fail at times.
