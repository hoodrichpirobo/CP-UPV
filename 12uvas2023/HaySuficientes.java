import java.util.*;

public class HaySuficientes{ 

    static java.util.Scanner in;

    public static void casoDePrueba() {
      
     int uvas = in.nextInt();
     int personas = in.nextInt();
     long foreach = personas*12;

     if(uvas>=foreach){
         System.out.println("SI");
     } else {
         System.out.println("NO");
     }

    } 

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } 
}
