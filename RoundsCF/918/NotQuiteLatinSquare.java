import java.util.*;

public class NotQuiteLatinSquare{

    static Scanner in;

    public static void casoDePrueba() {
        // Corrected the ProperSquare initialization to use single quotes.
        Character[] ProperSquare = {'A', 'B', 'C'};
        // Changed "a" to 'a' to match the char type.
        char sol = 'a';

        for(int i = 0; i < 3; i++){
            String line = in.nextLine();
                Character[] Square = new Character[line.length()];
                for(int j = 0; j < line.length(); j++){
                    Square[j] = line.charAt(j);
                }
                Arrays.sort(Square, new Comparator<Character>(){
                    public int compare(Character c1, Character c2){
                        if(c1=='?') return 1;
                        if(c2=='?') return -1;

                        return c1.compareTo(c2);
                    }
                });
                
                // Check if Square has the same elements as ProperSquare.
                if(!Arrays.equals(Square, ProperSquare)){
                    // Use a different variable (k) here to avoid confusion with the outer loop's i.
                    for(int k = 0; k < Square.length; k++){
                        if(Square[k] != ProperSquare[k]){
                            sol = ProperSquare[k];
                            break; // Break as we found the first different char.
                        }
                    }
                }
            
        }
        System.out.println(sol);
    }

    public static void main(String[] args) {

        in = new Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();  // Consume the rest of the line after the integer input.
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}



