// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/
import java.util.*;

public class C {
    static Scanner in;

    public static long testCase(int[] shoulders, int[] heads){
        int max = 0;
        for(int j = 0; j < heads.length; j++){
            max = Math.max(max, heads[j] - shoulders[j]);
        }

        long totalHeight = max;
        for(int k = 0; k < shoulders.length; k++){
            totalHeight += shoulders[k];
        }

        return totalHeight;
    }

    public static void main(String[] args){
        in = new Scanner(System.in);
        int giants = in.nextInt();
        int[] shoulders = new int[giants];
        int[] heads = new int[giants];

        for(int i = 0; i < giants; i++){
            shoulders[i] = in.nextInt();
            heads[i] = in.nextInt();
        }

        System.out.println(testCase(shoulders, heads));
    }
}
