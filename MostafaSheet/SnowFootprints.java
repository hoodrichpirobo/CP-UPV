import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());
        String road = in.readLine();

        for (int i = 0; i < n; i++) {
            if (road.charAt(i) != '.') {
                if (road.charAt(i) == 'R') {
                    while (road.charAt(i) == 'R') {
                        i++;
                    }
                    out.println((i) + " " + (i + 1));
                } else {
                    out.println((i + 1) + " " + (i));
                }
                break;
            }
        }

        out.close();
    }
}
