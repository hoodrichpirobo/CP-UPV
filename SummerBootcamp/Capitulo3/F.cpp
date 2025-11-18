#include <bits/stdc++.h>
using namespace std;
using ll = long long;

void solve() {
  ll m, p, n, pi, sum = 0;

  cin >> m >> p;
  cin >> n;

  p *= m;
  for(int i = 0; i < n; i++) {
    cin >> pi;
    sum += pi;
  }

  if(n > m) {
    cout << "No cabemos" << endl;
  } else if (sum > p) {
    cout << "Nos quedamos atrapados" << endl;
  } else {
    cout << "Todo bien" << endl;
  }
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;
  while(t--) {
    solve();
  }

  return 0;
}
