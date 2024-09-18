import java.io.*;

public class InverseCaptcha{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("input.in"));
        PrintWriter out = new PrintWriter(System.out);

        String line = in.readLine();
        char[] arr = line.toCharArray();
        int n = arr.length,
            sum = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i - 1]){
                sum += (arr[i] - '0');
            }
        }
        if(arr[0] == arr[n - 1]){
            sum += (arr[0] - '0');
        }

        out.println(sum);

        out.close();
    }
}
