import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        // Read the input string representing the exhibit's name
        String line = in.readLine();
        int rotations = 0; // To accumulate the total number of rotations needed
        int last = 1; // Starting position is 'a', which is position 1 in our 1-based index
        int len = 26; // The length of the alphabet, which is 26

        // Loop through each character in the string
        for(char c : line.toCharArray()){
            // Convert the character to its corresponding position in the alphabet
            // 'a' = 1, 'b' = 2, ..., 'z' = 26
            int next = c - 96;
            
            // Calculate the clockwise distance from 'last' to 'next'
            int clockwise = Math.abs(next - last);
            
            // Calculate the counterclockwise distance
            // This works because the total distance around the wheel is 'len' (26).
            // By subtracting the clockwise distance from 'len', we get the distance
            // if we go the other way around the circle.
            int counterclockwise = len - clockwise;
            
            // Determine the minimum distance to rotate to the target letter
            int min = Math.min(clockwise, counterclockwise);

            // Accumulate the minimum number of rotations needed
            rotations += min;
            
            // Update the last position to the current character's position
            last = next;
        }

        // Output the total number of rotations required
        out.println(rotations);

        out.close();
    }
}
