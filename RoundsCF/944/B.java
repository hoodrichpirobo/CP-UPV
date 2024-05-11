// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class Solution{
    static Scanner in;

    public static void testCase(){
        String str = in.nextLine().trim();
        boolean allEqual = true;
        
        for(int j = 0; j < str.length(); j++){
            if(str.charAt(0)!=str.charAt(j)){
                allEqual = false;
            }
        }

        if(allEqual){
            System.out.println("NO");
        }else{
            System.out.println("YES");
            System.out.println(shuffle(str));
        }

    }

    public static String shuffle(String str){
        List<Character> characters = new ArrayList<>();

        for(char each : str.toCharArray()){
            characters.add(each);
        }

        String shuffledString;
        do{
            Collections.shuffle(characters);
            StringBuilder sb = new StringBuilder(characters.size());
            for(char each : characters){
                sb.append(each);
            }

            shuffledString = sb.toString();
        }while(shuffledString.equals(str));

        return shuffledString;
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
