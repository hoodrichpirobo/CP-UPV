#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int N, M;
  int greatest = -1;
  cin >> N >> M;
  vector<vector<int>> matrix(N, vector<int>(M));
  for(int i = 0; i < N; i++) {
    int row = 0;
    for(int j = 0; j < M; j++) {
      cin >> matrix[i][j];
      row += matrix[i][j];
    }
    greatest = max(greatest, row);
  }

  for(int i = 0; i < M; i++) {
    int col = 0;
    for(int j = 0; j < N; j++) {
      col += matrix[j][i];
    }
    greatest = max(greatest, col);
  }

  cout << greatest << endl;

  return 0;
}
