import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        Stack<String> stack = new Stack<>();
        Stack<String> hand = new Stack<>();
        for(int j = 0; j < 52; j++){
            stack.push(tokens.nextToken());
        }

        for(int j = 0; j < 25; j++){
            hand.push(stack.pop());
        }

        int y = 0, x;
        for(int j = 0; j < 3; j++){
            if(Character.isLetter(stack.peek().charAt(0))) x = 10;
            else x = (stack.peek().charAt(0) - '0');
            y += x;
            stack.pop();
            for(int k = 0; k < (10 - x); k++){
                stack.pop();
            }
        }

        for(int j = 0; j < 25; j++){
            stack.push(hand.pop());
        }

        int size = stack.size() - y;
        for(int j = 0; j < size; j++){
            stack.pop();
        }

        return stack.pop();
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i <= TC; i++){
            ans.append("Case ").append(i).append(": ").append(solve()).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
