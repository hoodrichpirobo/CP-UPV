import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        String line = in.readLine();
        char[] blocks = line.toCharArray();

        for(int i = 0; i < n; i++){
            if(blocks[i] == '.') continue;

            if(blocks[i] == 'L'){
                out.println((line.lastIndexOf('L') + 1) + " " + i);
                break;
            }

            if(blocks[i] == 'R'){
                int r = line.lastIndexOf('R') + 1;
                i++;

                if(blocks[r] == 'L'){
                    out.println(i + " " + r);
                }else{
                    out.println(i + " " + (r + 1));
                }

                break;
            }
        }
        
        out.close();
    }
}
