import java.io.*;

public class beekeeper{
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        while(true){
            int N = Integer.parseInt(in.readLine());

            if(N == 0) break;

            char[] arr;
            String fav = "", line;
            int max = Integer.MIN_VALUE, count;

            while(N-->0){
                line = in.readLine();
                arr = line.toCharArray();
                count = 0;
                
                for(int i = 0; i < arr.length - 1; i++){
                    if(isVowel(arr[i]) && arr[i] == arr[i + 1]){
                        count++;
                        i++;
                    }
                }

                if(count > max){
                    max = count;
                    fav = line;
                }
            }

            out.println(fav);
        }

        out.close();
    }
}
