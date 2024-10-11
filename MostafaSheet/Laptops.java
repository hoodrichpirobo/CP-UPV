import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        Key Observations:

        1. Distinct Prices and Qualities as Permutations:
           - Since all 'a_i' (prices) are distinct integers between 1 and 'n', they form a permutation of the numbers from 1 to 'n'.
           - Similarly, all 'b_i' (qualities) are distinct integers between 1 and 'n', forming another permutation of the same set.

        2. Sorting Laptops by Price:
           - If we sort the laptops in increasing order of their prices 'a_i', the positions of the qualities 'b_i' in this sorted list can reveal whether a cheaper laptop has higher quality than a more expensive one.
           - Specifically, if the sequence of qualities 'b_i' in the sorted list is not in increasing order, there exists at least one pair where a cheaper laptop has higher quality.

        Implementation Details:
        - If all 'a_i' equal 'b_i', both permutations are identical, and when sorted by price, the qualities will also be in increasing order.
          This means no cheaper laptop has higher quality than a more expensive one, so Alex is wrong, and we output "Poor Alex".
        - If there is at least one 'a_i' not equal to 'b_i', the permutations are different, and when sorted by price, the qualities will not be in increasing order.
          This means there is at least one inversion, indicating that a cheaper laptop has higher quality than a more expensive one.
          Therefore, Alex is correct, and we output "Happy Alex".
        */

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()); // Number of laptops
        StringTokenizer tokens;
        String ans = "Poor Alex"; // Default answer

        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(tokens.nextToken()); // Price of the i-th laptop
            int b = Integer.parseInt(tokens.nextToken()); // Quality of the i-th laptop

            if (a != b) {
                // Found a laptop where price != quality.
                // This means the permutations are different, leading to at least one inversion.
                // So Alex is correct.
                ans = "Happy Alex";
                break;
            }
        }
        out.println(ans);

        out.close();
    }
}

