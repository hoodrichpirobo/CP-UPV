import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            int L = Integer.parseInt(in.readLine()),
                min = Integer.MAX_VALUE, 
                r = Integer.MIN_VALUE, 
                d = Integer.MAX_VALUE;

            if(L == 0){
                break;
            }

            char[] arr = in.readLine().toCharArray();
            for(int i = 0; i < L; i++){
                if(arr[i] == 'Z'){
                    min = 0;
                    break;
                }else if(arr[i] == 'R'){
                    r = i + 1;
                    min = Math.min(Math.abs(r - d), min);
                }else if(arr[i] == 'D'){
                    d = i + 1;
                    min = Math.min(Math.abs(r - d), min);
                }
            }

            ans.append(min + "\n");
        }
        out.print(ans);

        out.close();
    }
}
