import java.io.*;
import java.util.*;

public class Main{
    static int n, m;
    static Map<Integer, List<Edge>> colorEdges = new HashMap<>();

    public static class Edge{
        int u, v;

        public Edge(int u, int v){
            this.u = u;
            this.v = v;
        }
    }

    public static boolean dfsColor(int start, int target, int color){
        boolean[] visited = new boolean[n + 1];
        return dfs(start, target, color, visited);
    }

    public static boolean dfs(int current, int target, int color, boolean[] visited){
        if(current == target) return true;

        visited[current] = true;

        for(Edge e : colorEdges.get(color)){
            if(e.u == current && !visited[e.v]){
                if(dfs(e.v, target, color, visited)) return true;
            }
            if(e.v == current && !visited[e.u]){
                if(dfs(e.u, target, color, visited)) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        for(int i = 0; i < m; i++){
            tokens = new StringTokenizer(in.readLine());
            int u = Integer.parseInt(tokens.nextToken()),
                v = Integer.parseInt(tokens.nextToken()),
                color = Integer.parseInt(tokens.nextToken());

            colorEdges.putIfAbsent(color, new ArrayList<>());
            colorEdges.get(color).add(new Edge(u, v));
        }

        int q = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < q; i++){
            tokens = new StringTokenizer(in.readLine());
            int u = Integer.parseInt(tokens.nextToken()),
                v = Integer.parseInt(tokens.nextToken()),
                count = 0;

            for(int color : colorEdges.keySet()){
                if(dfsColor(u, v, color))
                    count++;
            }
            ans.append(count).append('\n');
        }
        out.print(ans);

        out.close();
    }
}
