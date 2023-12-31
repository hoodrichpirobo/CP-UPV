import java.util.*;

public class EnchufandoLasLucesDeNavidad { 
    static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        while (true) {
            int regletas = in.nextInt();
            if (regletas == 0) {
                break;
            }

            int totalEnchufes = 0;
            for (int i = 0; i < regletas; i++) {
                int enchufesPorRegleta = in.nextInt();
                totalEnchufes += enchufesPorRegleta - 1;
            }

            totalEnchufes += 1;

            System.out.println(totalEnchufes);
        }
        in.close();
    } 
}
