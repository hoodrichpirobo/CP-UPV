import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        char[] D = in.readLine().toCharArray();
        int[] arr = new int[100];
        int k = 0;
        for(int j = 0; j < D.length; j++){
            switch(D[j]){
                case '+':
                    arr[k] = (arr[k] + 1)%256;
                    break;
                case '-':
                    arr[k] = ((arr[k] - 1) + 256)%256;
                    break;
                case '<':
                    k = ((k - 1) + 100)%100;
                    break;
                case '>':
                    k = ((k + 1)%100);
                    break;
                default:
                    break;
            }
        }

        StringBuilder dAns = new StringBuilder();
        for(int j = 0; j < 100; j++){
            if(j>0) dAns.append(" ");
            dAns.append(String.format("%02X", arr[j]));
        }
        dAns.append('\n');
        return dAns.toString();
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i <= TC; i++){
            ans.append("Case ").append(i).append(": ").append(solve());
        }
        out.print(ans);

        out.close();
    }
}
