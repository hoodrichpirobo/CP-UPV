import java.io.*;

public class battlesimulation{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        char[] arr = in.readLine().toCharArray();
        StringBuilder ans = new StringBuilder();
        char iMinusTwo = ' ', iMinusOne = ' ', i = ' ';
        for(int j = 0; j < arr.length; j++){
            if(j < arr.length - 2){
                i = arr[j + 2];
                iMinusOne = arr[j + 1];
            }
            iMinusTwo = arr[j];
            if(j < arr.length - 2 && iMinusOne != iMinusTwo && iMinusTwo != i && iMinusOne != i){
                ans.append('C');
                j += 2;
            }else if(iMinusTwo == 'R'){
                ans.append('S');
            }else if(iMinusTwo == 'B'){
                ans.append('K');
            }else if(iMinusTwo == 'L'){
                ans.append('H');
            }
        }
        out.println(ans);

        out.close();
    }
}
