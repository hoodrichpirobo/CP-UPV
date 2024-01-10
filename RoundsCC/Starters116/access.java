import java.util.Scanner;

class Codechef {

    static Scanner in = new Scanner(System.in);

    public static void CasoDePrueba() {
        int lengthOfString = in.nextInt();
        int swipesAfterRenewal = in.nextInt();
        in.nextLine();
        String line = in.nextLine();

        int swipesLeft = 0;
        boolean accessDenied = false;

        for (char c : line.toCharArray()) {
            if (c == '0') {
                if (swipesLeft == 0) {
                    accessDenied = true;
                    break;
                }
                swipesLeft--;
            } else if (c == '1') {
                swipesLeft = swipesAfterRenewal;
            }
        }

        System.out.println(accessDenied ? "NO" : "YES");
    }

    public static void main(String[] args) {
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            CasoDePrueba();
        }

        in.close();
    }
}
