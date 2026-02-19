#include <bits/stdc++.h>
using namespace std;
using ll = long long;

void solve() {
  ll N, M;
  double e;
  cin >> N >> M >> e;

  vector<vector<double>> matrix(N, vector<double>(M));
  for(int i = 0; i < N; i++) {
    for(int j = 0; j < M; j++) {
      cin >> matrix[i][j];
      if(abs(matrix[i][j]) <= e) matrix[i][j] = 0;

      cout << setprecision(6) << fixed << matrix[i][j] << ' ';
    }
    cout << '\n';
  }
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int TC;
  cin >> TC;
  while(TC--) {
    solve();
  }

  return 0;
}
