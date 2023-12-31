import java.util.*;

public class Pendientes{

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int p = in.nextInt();
        if (p<=0)
            return false;
        else {
            ArrayList<Integer> numeros = new ArrayList<>();

            for(int i = 0; i < p; i++){;
                int num = in.nextInt();
                numeros.add(num);
            }

            System.out.println(countPairs(numeros));

            return true;
         }
    } 

    public static int countPairs(ArrayList<Integer> numeros){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : numeros){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num,1);
            }
        }

        int pairCount = 0;

        for(int count : map.values()){
            pairCount += count / 2;
        }

        return pairCount;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } 

}
