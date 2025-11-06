#include <bits/stdc++.h>
using namespace std;

using ll = long long;

ll number_spiral(ll x, ll y) {
  ll z = max(x, y),
     z2 = z * z,
     z1 = (z - 1) * (z - 1);

  if (z % 2 == 0) {
    if (x == z) return z2 - y + 1;
    return z1 + x;
  } else {
    if (y == z) return z2 - x + 1;
    return z1 + y;
  }
}

void solve() {
  ll x, y;
  cin >> x >> y;
  cout << number_spiral(x, y) << '\n';
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int T;
  cin >> T;
  while(T--) solve();
  return 0;
}
