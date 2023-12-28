import java.util.*;

public class CanISquare{
    
    static Scanner in;
    
    public static void testCase(){
        long a = in.nextLong(); // Change to long
        long sum = 0; // Change to long

        for(long j = 0; j < a; j++){ // Change loop variable to long
            sum += in.nextLong(); // Change to nextLong()
        }

        if(isPerfectSquare(sum)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public static boolean isPerfectSquare(long number){ // Change parameter to long
        long sqrt = (long) Math.sqrt(number); // Change to long
        return number == sqrt*sqrt;
    }
    
    public static void main(String[] args){
        
        in = new Scanner(System.in);
        
        long cases = in.nextLong(); // Change to long
        for(long i = 0; i < cases; i++) // Change loop variable to long
            testCase();
        
    }
}

