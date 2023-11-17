import java.util.*;

public class A{
    static java.util.Scanner in;
    public static String casoDePrueba(){
        int n = in.nextInt(), moves = 0, vanyasum = n, vanyadiff = n, vovasum = n, vovadiff = n;
        vanyasum++;
        vanyadiff--;
        while(vanyasum%3!=0 && vanyadiff%3!=0 && moves<10){
            moves++;
            vovasum++;
            vovadiff--;
        }
        
        if (vanyasum%3==0 || vanyadiff%3==0 || moves==0){return "First";}
        if (vovasum%3==0 || vovadiff%3==0 && moves !=0){return "Second";}
        return "Second";
    }
    
    public static void main(String[] args){
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        in.nextLine();
        List<String> resultados = new ArrayList<>();
        
        for(int i = 0; i < numCasos;i++){
            resultados.add(casoDePrueba());
        }
        
        for(String resultado : resultados){
            System.out.println(resultado);
        }
    }
}
