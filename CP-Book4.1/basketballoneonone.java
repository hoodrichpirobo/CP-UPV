import java.io.*;

public class basketballoneonone{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        char[] arr = in.readLine().toCharArray();
        int a = 0, b = 0;
        
        for(int i = 0; i < arr.length; i += 2){
            if(arr[i] == 'A'){
                a += (arr[i + 1] + '0');
            }else if(arr[i] == 'B'){
                b += (arr[i + 1] + '0');
            }
       }

        if(((a >= b + 2) && b >= 10) || (a >= 11 && b < 10)){
            out.println("A");
        }else if(((b >= a + 2) && a >= 10) || (b >= 11 && a < 10)){
            out.println("B");
        }

        out.close();
    }    
}
