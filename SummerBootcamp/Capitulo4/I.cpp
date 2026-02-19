#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int N, M;
  cin >> N >> M;

  vector<vector<char>> matrix(N, vector<char>(M));

  for(int i = 0; i < N; i++) {
    for(int j = 0; j < M; j++) {
      cin >> matrix[i][j];
    }
  }

  string ans = "ORIGINAL";
  for(int i = 0; i <= N - 2; i++) {
    for(int j = 0; j <= M - 2; j++) {
      
      if(matrix[i][j] == matrix[i + 1][j + 1] && 
          matrix[i][j] == matrix[i + 1][j] &&
          matrix[i][j] == matrix[i][j + 1]) {
        ans = "NO ORIGINAL";
        break;
      }

    }

    if(ans == "NO ORIGINAL") break;

  }

  cout << ans << endl;

  return 0;
}
