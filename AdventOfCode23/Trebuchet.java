import java.util.*;

public class Trebuchet {
    
    // Static variables used across the class
    static java.util.Scanner in; // Scanner for input
    static int aux, sum = 0; // 'aux' for temporary storage and 'sum' to accumulate results
    static String conc = ""; // 'conc' to concatenate certain strings
    
    // Method to process each test case
    public static boolean testCase(){
        // Check if there's more input
        if(!in.hasNext())
            return false; // If no more input, return false
        else {
            String txt = in.nextLine().trim(); // Read and trim the next line of input
            List<Integer> digits = new ArrayList<>(); // List to store digits found in 'txt'
            
            // Iterate through each character in 'txt'
            for(int i = 0; i < txt.length(); i++){
                // Check if the character is a digit
                if(Character.isDigit(txt.charAt(i))){
                    // Convert character to integer and add to the list
                    aux = Integer.valueOf(txt.charAt(i)-'0');
                    digits.add(aux);
                }
            }
            
            // Concatenate the first and last digits in the list as a string
            conc = String.valueOf(digits.get(0)) + String.valueOf(digits.get(digits.size() - 1)); 
            // Add the integer value of 'conc' to 'sum'
            sum += Integer.valueOf(conc);
            
            return true; // Return true indicating a test case has been processed
        }
    }
    
    // Main method
    public static void main(String[] args){
        
        in = new java.util.Scanner(System.in); // Initialize the scanner
        
        // Continuously process test cases until there's no more input
        while(testCase()){
            System.out.println(sum); // Print the current sum after each test case
        }
        
    }
    
}
