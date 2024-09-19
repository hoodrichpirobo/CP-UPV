import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = 4;
        char[][] cells = new char[n][n];        
        for(int i = 0; i < n; i++){
            String line = in.readLine();
            char[] row = line.toCharArray();
            for(int j = 0; j < n; j++){
                cells[i][j] = row[j];
            }
        }

        String ans = "NO";
        for(int i = 0; i < n - 1 && !ans.equals("YES"); i++){
            for(int j = 0; j < n - 1; j++){
                int white = 0;
                if(cells[i][j] == '.'){
                    white++;
                }
                if(cells[i][j + 1] == '.'){
                    white++;
                }
                if(cells[i + 1][j] == '.'){
                    white++;
                }
                if(cells[i + 1][j + 1] == '.'){
                    white++;
                }
                if(white <= 1 || white >= 3){
                   ans = "YES"; 
                   break;
                }
            }
        }
        out.println(ans);

        out.close();
    }
}
