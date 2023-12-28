import java.util.*;

public class OddOneOut{ 

    static java.util.Scanner in;

    public static void casoDePrueba() {
      
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int odd = a;

        if(a == b){
            odd = c;
        }

        if(a == c){
            odd = b;
        }

        if(b==c){
            odd = a;
        }

        System.out.println(odd);

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
