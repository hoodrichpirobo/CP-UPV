import java.io.*;
import java.util.*;

public class treasurehunt {
  public static String hunt(char[][] matrix, int i, int j) {
    int R = matrix.length, C = matrix[0].length, sum = 0;
    boolean[][] visited = new boolean[R][C];

    while (i >= 0 && i < R && j >= 0 && j < C) {
      if (visited[i][j]) {
        return "Lost";
      }
      char current = matrix[i][j];
      if (current == 'T') {
        return Integer.toString(sum);
      }
      visited[i][j] = true;
      sum++;

      switch (current) {
        case 'N':
          i--;
          break;
        case 'S':
          i++;
          break;
        case 'W':
          j--;
          break;
        case 'E':
          j++;
          break;
      }
    }
    return "out";
  }

  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    StringTokenizer tokens = new StringTokenizer(in.readLine());
    int R = Integer.parseInt(tokens.nextToken()),
        C = Integer.parseInt(tokens.nextToken());
    char[][] matrix = new char[R][C];
    for (int i = 0; i < R; i++) {
      String line = in.readLine();
      for (int j = 0; j < C; j++) {
        matrix[i][j] = line.charAt(j);
      }
    }

    out.println(hunt(matrix, 0, 0));
    out.close();
  }
}

