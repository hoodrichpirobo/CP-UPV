import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String x;
        while (true) {
            x = in.readLine().trim();                           //42                            5
            if (x.equals("END")) {
                break;
            }
            
            int i = 1;                  // .n
            while (true) {
                String x_next = Integer.toString(x.length());   //2         1           1       1       1
                if (x.equals(x_next)) { //x_i = x_i+1             42 != 2   2 != 1      1==1    5!=1    1==1
                    break;
                } else {
                    x = x_next;                                 //2         1                   1
                    i++;                                        //a.n       ab.n                a.n
                }
            }
            out.println(i);                                     //3                                     2
        }
        out.close();
    }
}

