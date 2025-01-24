import java.io.*;
import java.util.*;

public class fastfood{
    static BufferedReader in;
    static PrintWriter out;

    static class Prize {
        List<Integer> requiredTypes;
        int value;

        Prize(List<Integer> requiredTypes, int value){
            this.requiredTypes = requiredTypes;
            this.value = value;
        }
    }

    public static long solve() throws Exception {
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            m = Integer.parseInt(tokens.nextToken()),
            k;

        List<Prize> prizes = new ArrayList<>();

        for(int i = 0; i < n; i++){
            tokens = new StringTokenizer(in.readLine());
            k = Integer.parseInt(tokens.nextToken());
            List<Integer> types = new ArrayList<>();
            for(int j = 0; j < k; j++){
                types.add(Integer.parseInt(tokens.nextToken()) - 1);
            }

            prizes.add(new Prize(types, Integer.parseInt(tokens.nextToken())));
        }

        int[] stickerCounts = new int[m];
        tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < m; i++){
            stickerCounts[i] = Integer.parseInt(tokens.nextToken());
        }

        long totalCash = 0;
        for(Prize eachPrize : prizes){
            int minCount = Integer.MAX_VALUE;
            for(int eachType : eachPrize.requiredTypes){
                minCount = Math.min(stickerCounts[eachType], minCount);
            }
            totalCash += (long) minCount * eachPrize.value;
        }

        return totalCash;
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        while(TC --> 0){
            ans.append(solve()).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
