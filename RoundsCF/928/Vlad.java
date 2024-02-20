import java.util.*;

public class Vlad {
    static Scanner in;

    public static void testCase() {
        String str = in.nextLine();
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                countA++;
            } else if (str.charAt(i) == 'B') {
                countB++;
            }
        }
        if (countA > countB) {
            System.out.println("A");
        } else {
            // Print B by default if B is greater or equal to A
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int testCases = in.nextInt();
        in.nextLine(); // consume the newline
        for (int i = 0; i < testCases; i++) {
            testCase();
        }
    }
}

