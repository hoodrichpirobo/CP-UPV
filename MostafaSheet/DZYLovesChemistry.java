import java.io.*;
import java.util.*;

public class Main{
    static int[] parent;

    public static void make_set(int n){
        parent = new int[n + 1];
        for(int i = 1; i <= n; i++){
            parent[i] = i;
        }
    }

    public static int find_set(int v){
        if(v == parent[v]) return v;
        parent[v] = find_set(parent[v]);
        return parent[v];
    }

    public static void union_sets(int a, int b){
        a = find_set(a);
        b = find_set(b);

        if(a != b) parent[b] = a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            m = Integer.parseInt(tokens.nextToken());
        make_set(n);
        
        for(int i = 0; i < m; i++){
            tokens = new StringTokenizer(in.readLine());
            union_sets(Integer.parseInt(tokens.nextToken()), Integer.parseInt(tokens.nextToken()));
        }

        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= n; i++){
            set.add(find_set(i));
        }
        out.println((long)(Math.pow(2, (n - set.size()))));

        out.close();
    }
}
