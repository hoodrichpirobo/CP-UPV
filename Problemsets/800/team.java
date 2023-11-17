import java.util.Scanner;

public class team_231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pCount = sc.nextInt();
        int sureSum;
        int problemCount = 0;

        for (int i = 0; i < pCount; i++) {
            sureSum = 0;

            for (int j = 0; j < 3; j++) {
                sureSum += sc.nextInt();
            }

            if (sureSum >= 2) {
                problemCount++;
            }
        }

        System.out.println(problemCount);

        sc.close();
    }
}
