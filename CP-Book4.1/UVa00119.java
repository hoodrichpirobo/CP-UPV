import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        StringBuilder ans = new StringBuilder();
        boolean first = true;
        while((line = in.readLine()) != null && !line.isEmpty()){
            if(!first){
                ans.append('\n');
            }
            int n = Integer.parseInt(line);

            StringTokenizer tokens = new StringTokenizer(in.readLine());
            Map<String, Integer> map = new HashMap<>();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++){
                arr[i] = tokens.nextToken();
                map.put(arr[i], 0);
            }
            
            String name;
            int moneyToSpend, friends, mod;
            for(int i = 0; i < n; i++){
                tokens = new StringTokenizer(in.readLine());
                name = tokens.nextToken();
                moneyToSpend = Integer.parseInt(tokens.nextToken());
                friends = Integer.parseInt(tokens.nextToken());
                if(friends > 0){
                    map.replace(name, (map.get(name) - (moneyToSpend - moneyToSpend%friends)));
                    for(int j = 0; j < friends; j++){
                        name = tokens.nextToken();
                        map.replace(name, (map.get(name) + (moneyToSpend/friends)));
                    }
                }
            }

            for(int i = 0; i < n; i++){
                ans.append(arr[i]).append(" ").append(map.get(arr[i])).append('\n');
            }
            first = false;
        }
        out.print(ans);

        out.close();
    }
}
