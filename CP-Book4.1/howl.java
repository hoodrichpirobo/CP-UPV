import java.io.*;

public class howl{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        char[] arr = in.readLine().toCharArray();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            ans.append(arr[i]);
            if(arr[i] == 'A'){
                ans.append('A');
            }
        }
        out.println(ans);

        out.close();
    }
}
