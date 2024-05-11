// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class Solution{
    static Scanner in;

    public static void testCase(){
        int a = in.nextInt(), b = in.nextInt(), 
            c = in.nextInt(), d = in.nextInt();
        ArrayList<Integer> rangeA = new ArrayList<>();

        if(a < b){
            rangeA = ranges(a, b);
        }else{
            rangeA = ranges(b, a);
        }

        if((rangeA.contains(c) && !rangeA.contains(d)) || (rangeA.contains(d) && !rangeA.contains(c)) ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public static ArrayList<Integer> ranges(int num1, int num2){
        ArrayList<Integer> range = new ArrayList<>();
        for(int j = num1; j <= num2; j++){
            range.add(j);
        }
        return range;
    }

    public static void main(String[] args){
        in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();
        for(int i = 0; i < testCases; i++){
            testCase();
        }
    }
}
