#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int N, P, M = INT_MIN, m = INT_MAX;
  cin >> N;

  for(int i = 0; i < N; i++) {
    cin >> P;

    M = max(M, P);
    m = min(m, P);
  }

  cout << m << ' ' << M << endl;

  return 0;
}
