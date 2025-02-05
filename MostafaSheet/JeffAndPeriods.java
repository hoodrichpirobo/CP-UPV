import java.io.*;
import java.util.*;

public class Main{
    static class Pair{
        int x, y;

        // x for diff, y for last index
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine()), value, len = 0;
        Map<Integer, Pair> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int[] a = new int[n];
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++){
            value = Integer.parseInt(tokens.nextToken());
            if(set.contains(value)) continue;
            if(!map.containsKey(value)){
                a[i] = value;
                len++;
                map.put(a[i], new Pair(-1, i));
            }else{
                if (map.get(value).x == -1) {
                    map.get(value).x = (i - map.get(value).y);
                }else {
                    if(map.get(value).x != (i - map.get(value).y)){
                        set.add(value);
                        len--;
                    }
                }

                map.replace(value, new Pair(i - map.get(value).y, i));
            }
        }

        Arrays.sort(a);
        StringBuilder ans = new StringBuilder();
        ans.append(len).append('\n');
        for(int each : a){
            if(!set.contains(each) && each != 0) {
                ans.append(each).append(" ");
                if(map.get(each).x == -1) ans.append(0);
                else ans.append(map.get(each).x);

                ans.append('\n');
            }
        }
        out.print(ans);

        out.close();
    }
}
