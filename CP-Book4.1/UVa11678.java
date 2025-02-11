import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder ans = new StringBuilder();
        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());

            int A = Integer.parseInt(tokens.nextToken()),
                B = Integer.parseInt(tokens.nextToken());

            if(A == 0 && B == 0) break;

            tokens = new StringTokenizer(in.readLine());
            Set<Integer> set1 = new HashSet<>();
            for(int i = 0; i < A; i++){
                set1.add(Integer.parseInt(tokens.nextToken()));
            }

            tokens = new StringTokenizer(in.readLine());
            Set<Integer> aux = new HashSet<>(set1);
            Set<Integer> set2 = new HashSet<>();
            int each;
            for(int i = 0; i < B; i++){
                each = Integer.parseInt(tokens.nextToken());
                if(!aux.contains(each)) set2.add(each);
                else set1.remove(each);
            }

            int size = Math.min(set1.size(), set2.size());

            ans.append(size).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
