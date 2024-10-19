import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        Long x = Long.parseLong(in.readLine()),
             t;
        StringBuilder ans = new StringBuilder();
        while(x>0){
            t = x%10;
            x /= 10;
            
            if((9-t) < t){
                if(x <= 0 && (9-t) == 0){
                    ans.append(t);
                }else{
                    ans.append(9-t);
                }
            }else{
                ans.append(t);
            }
        }
        out.println(ans.reverse());

        out.close();
    }
}
