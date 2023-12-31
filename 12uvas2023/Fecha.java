import java.util.*;

public class Fecha { 

    static java.util.Scanner in;

    public static void casoDePrueba() {
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if(puedenFormarBloquesIguales(num1,num2,num3)){
            System.out.println("DIVERTIDOS");
        } else{
            System.out.println("INSULSOS");
        }
    }

    public static boolean puedenFormarBloquesIguales(int a, int b, int c) {
        // Asegurarse de que cada número tenga exactamente dos dígitos
        String sa = String.format("%02d", a);
        String sb = String.format("%02d", b);
        String sc = String.format("%02d", c);

        // Preparar las combinaciones posibles
        String[] combinaciones = {
            sa + sb + sc, sa + sc + sb,
            sb + sa + sc, sb + sc + sa,
            sc + sa + sb, sc + sb + sa
        };

        // Revisar cada combinación para determinar si forma bloques iguales
        for (String combinacion : combinaciones) {
            // Asegurarse de que la combinación tenga 6 caracteres antes de dividirla
            if (combinacion.length() == 6) {
                String mitad1 = combinacion.substring(0, 3);
                String mitad2 = combinacion.substring(3, 6);

                // Comparar las mitades
                if (mitad1.equals(mitad2)) {
                    return true; // Las mitades son iguales, retorna verdadero
                }
            }
        }

        // Si ninguna combinación forma bloques iguales, retorna falso
        return false;
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
