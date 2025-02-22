import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int n = Integer.parseInt(in.readLine().trim());
        char[] arr = in.readLine().toCharArray();
        
        String best = null;
       or (int r = 0; r < n; r++) {
            int diff = (10 - (arr[r] - '0')) % 10;
            StringBuilder candidate = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int digit = (arr[(r + j) % n] - '0' + diff) % 10;
                candidate.append(digit);
            }
            String candStr = candidate.toString();
            if (best == null || candStr.compareTo(best) < 0) {
                best = candStr;
            }
        }
        
        out.println(best);
        out.close();
    }
}

