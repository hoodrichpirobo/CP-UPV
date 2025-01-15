import java.io.*;

public class missingnumbers{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()),
            p, j = 1;
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < n; i++){
            p = Integer.parseInt(in.readLine());
            while(j < p){
                ans.append(j + "\n");
                j++;
            }
            j++;
        }

        if(ans.isEmpty()){
            ans.append("good job\n");
        }

        out.print(ans);

        out.close();
    }
}
