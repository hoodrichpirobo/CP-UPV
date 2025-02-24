import java.io.*;
import java.util.*;

public class Main{
    static int n, m;
    static char[][] board;
    static boolean[][] visited;
    static boolean cycleFound = false;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void dfs(int x, int y, int fromX, int fromY, char color, int count, boolean[][] inStack){
        if(cycleFound) return;

        visited[x][y] = true;
        inStack[x][y] = true;

        for(int d = 0; d < 4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
            if(board[nx][ny] != color) continue;
            if(nx == fromX && ny == fromY) continue;

            if(!visited[nx][ny]){
                dfs(nx, ny, x, y, color, count + 1, inStack);
            }else if (inStack[nx][ny] && count >= 4){
                cycleFound = true;
                return;
            }
        }

        inStack[x][y] = false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        board = new char[n][m];
        for(int i = 0; i < n; i++){
            board[i] = in.readLine().toCharArray();
        }

        visited = new boolean[n][m];
        boolean[][] inStack = new boolean[n][m];

        for(int i = 0; i < n && !cycleFound; i++){
            for(int j = 0; j < m && !cycleFound; j++){
                if(!visited[i][j]){
                    dfs(i, j, -1, -1, board[i][j], 1, inStack);
                }
            }
        }
        
        out.println(cycleFound ? "Yes" : "No");

        out.close();
    }
}
