import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        in.readLine();  in.readLine();  in.readLine();
        String line = in.readLine(),
               one = ".*.",
               two = "*..",
               three = "..*";
        in.readLine();
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 4*n; i += 4){
            if(line.substring(i, i + 3).equals(one)){
                ans.append(1);
            }else if(line.substring(i, i + 3).equals(two)){
                ans.append(2);
            }else if(line.substring(i, i + 3).equals(three)){
                ans.append(3);
            }
        }
        out.println(ans);

        out.close();
    }
}
