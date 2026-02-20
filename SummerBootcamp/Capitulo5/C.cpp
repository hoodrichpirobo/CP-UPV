#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll n;
  cin >> n;

  vector<pair<ll, string>> v(n);
  for(ll i = 0; i < n; i++) {
    cin >> v[i].first >> v[i].second;
  }

  sort(v.begin(), v.end());

  for(int i = 0; i < n; i++) {
    cout << v[i].first << ' ' << v[i].second << '\n';
  }
  
  return 0;
}
