import java.io.*;

public class InverseCaptcha{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("input.in"));
        PrintWriter out = new PrintWriter(System.out);

        String line = in.readLine();
        char[] arr = line.toCharArray();
        int n = arr.length,
            sum = 0,
            half = (n + 1)/2;

        for(int i = 0; i < n; i++){
            if(i + half >= n){
                if(arr[i] == arr[i - n + half]){
                    sum += (arr[i] - '0');
                }
            }else if(arr[i] == arr[i + half]){
                sum += (arr[i] - '0');
            }
        }

        out.println(sum);

        out.close();
    }
}
