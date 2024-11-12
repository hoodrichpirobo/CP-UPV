import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            m = Integer.parseInt(tokens.nextToken()),
            maxI = Integer.MIN_VALUE, minI = 0,
            maxJ = Integer.MIN_VALUE, minJ = 0;
        char c = tokens.nextToken().charAt(0);
        char[][] row = new char[n][m];
        Set<Integer> adjacencyI = new HashSet<>();
        Set<Integer> adjacencyJ = new HashSet<>();
        Set<Character> deputies = new HashSet<>();
        for(int i = 0; i < n; i++){
            aux[i] = in.readLine().toCharArray();
            for(int j = 0; j < m; j++){
                if(row[i][j] == c){
                    adjacencyI.add(i);
                    maxI = Math.max(maxI, i);  minI = Math.min(minI, i);
                    adjacencyJ.add(j);
                    maxJ = Math.max(maxJ, j);  minJ = Math.min(minJ, j);
                }
                if(adjacencyI.contains(i - 1) && adjacencyJ.contains(j)){
                    deputies.add(row[i][j]);
                }

                if(adjacencyI.contains(i) && adjacencyJ.contains(j - 1)){
                    deputies.add(row[i][j]);
                }
            }
        }

        for(int i = maxI; i >= minI; i--){
            for(int j = maxJ; j >= minJ; j--){
                if(adjacencyI.contains(i + 1) && adjacencyJ.contains(j)){
                    deputies.add(row[i][j]);
                }
                if(adjacencyI.contains(i) && adjacencyJ.contains(j + 1)){
                    deputies.add(row[i][j]);
                }
            }
        }

        deputies.remove(Character.valueOf(c));
        deputies.remove(Character.valueOf('.'));
        out.println(deputies.size());

        out.close();
    }
}
