#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll N, M;
  cin >> N >> M;

  vector<string> matrix(N);
  for(int i = 0; i < N; i++) {
      cin >> matrix[i];
  }

  vector<int> x = {-1, 0, 1};
  for(int i = 0; i < N; i++) {
    for(int j = 0; j < M; j++) {
      int bombCount = 0;
      if(matrix[i][j] == '*') {
        cout << 'F';
        continue;
      } else {
        for(int i2 = 0; i2 < 3; i2++) {
          if(i + x[i2] >= N || i + x[i2] < 0) continue;
          for(int j2 = 0; j2 < 3; j2++) {
            if(j + x[j2] >= M || j + x[j2] < 0) continue;

            if(matrix[i + x[i2]][j + x[j2]] == '*') bombCount++;
          }
        }
      }

      if(bombCount == 0) cout << ' ';
      else cout << bombCount;
    }
    cout << '\n';
  }

  return 0;
}
