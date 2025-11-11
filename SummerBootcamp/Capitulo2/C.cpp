#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(nullptr);

  ll n, a, b, c, d;
  cin >> n;
  cin >> a >> b >> c >> d;

  cout << n + a << endl;
  cout << n - b << endl;
  cout << n * c << endl;
  cout << (ll) (n / d) << endl;
  cout << n % d << endl;

  return 0;
}
