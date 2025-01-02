import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while (true) {
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int loanDuration = Integer.parseInt(tokens.nextToken());
            double downPayment = Double.parseDouble(tokens.nextToken());
            double loanAmount = Double.parseDouble(tokens.nextToken());
            int numRecords = Integer.parseInt(tokens.nextToken());

            if (loanDuration < 0) {
                break;
            }

            double[] depreciation = new double[loanDuration + 1];
            Arrays.fill(depreciation, -1.0);

            for (int i = 0; i < numRecords; i++) {
                tokens = new StringTokenizer(in.readLine());
                int monthIndex = Integer.parseInt(tokens.nextToken());
                double depRate = Double.parseDouble(tokens.nextToken());
                depreciation[monthIndex] = depRate;
            }

            for (int m = 1; m <= loanDuration; m++) {
                if (depreciation[m] < 0) {
                    depreciation[m] = depreciation[m - 1];
                }
            }

            double carValue = loanAmount + downPayment;
            double owe = loanAmount;

            carValue -= carValue * depreciation[0];

            if (owe < carValue) {
                ans.append("0 months\n");
                continue;
            }

            double monthlyPayment = loanDuration > 0 ? (loanAmount / loanDuration) : 0.0;

            int monthWhenOweLess = 0;

            for (int m = 1; m <= loanDuration; m++) {
                owe -= monthlyPayment;

                carValue -= (carValue * depreciation[m]);

                if (owe < carValue) {
                    monthWhenOweLess = m;
                    break;
                }
            }

            if (monthWhenOweLess == 1) {
                ans.append("1 month\n");
            } else {
                ans.append(monthWhenOweLess + " months\n");
            }
        }
        out.print(ans);

        out.close();
    }
}
