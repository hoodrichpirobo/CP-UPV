import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        char[] arr = in.readLine().toCharArray();
        Deque<Integer> deque = new ArrayDeque<>();
        int units = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '\\'){
                deque.push(i);
            }else if(arr[i] == '/' && !deque.isEmpty()){
                units += (i - deque.pop());
            }
        }

        return (units + "\n");
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        while(TC-->0){
            ans.append(solve());
        }
        out.print(ans);

        out.close();
    }
}
