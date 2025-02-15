import java.io.*;
import java.util.*;

public class memorymatch{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.readLine()),
            K = Integer.parseInt(in.readLine()),
            totalPairs = N/2, c1, c2;
        Set<String> completed = new HashSet<>();
        Map<String, Set<Integer>> H = new HashMap<>();
        Set<Integer> seen = new HashSet<>();
        StringTokenizer tokens;
        String p1, p2;
        for(int i = 0; i < K; i++){
            tokens = new StringTokenizer(in.readLine());
            c1 = Integer.parseInt(tokens.nextToken());
            c2 = Integer.parseInt(tokens.nextToken());
            p1 = tokens.nextToken();
            p2 = tokens.nextToken();

            seen.add(c1);
            seen.add(c2);

            if(p1.equals(p2)){
                completed.add(p1);
            }else{
                H.computeIfAbsent(p1, k -> new HashSet<>()).add(c1);
                H.computeIfAbsent(p2, k -> new HashSet<>()).add(c2);
            }
        }

        Set<String> allPics = new HashSet<>();
        allPics.addAll(completed);
        allPics.addAll(H.keySet());

        int cnt = 0;
        if(allPics.size() >= totalPairs){
            cnt = totalPairs - completed.size();
        }else{
            for(Map.Entry<String, Set<Integer>> entry : H.entrySet()){
                if(!completed.contains(entry.getKey()) && entry.getValue().size() >= 2){
                    cnt++;
                }
            }

            if(seen.size() + 2 == N && allPics.size() + 1 >= totalPairs){
                cnt++;
            }
        }
        out.println(cnt);

        out.close();
    }
}
