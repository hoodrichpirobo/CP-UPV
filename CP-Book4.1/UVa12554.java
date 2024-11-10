import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        String[] arr1 = new String[n];

        for(int i = 0; i < n; i++){
            arr1[i] = in.readLine();
        }

        String[] arr2 = {"Happy", "birthday", "to", "you",
                        "Happy", "birthday", "to", "you",
                        "Happy", "birthday", "to", "Rujia",
                        "Happy", "birthday", "to", "you"};

        int i = 0, j = 0;
        while(i < n || j%16 != 0){
            out.println(arr1[i%n] + ": " + arr2[j%16]);
            i++; j++;
        }

        out.close();
    }
}
