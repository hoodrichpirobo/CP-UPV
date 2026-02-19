#include <bits/stdc++.h>
using namespace std;
using ll = long long;

string binarySearch(ll C, ll l, ll r, const vector<ll>& L) {
  if(l <= r){
    ll mid = (r + l)/2;
    if(L[mid] == C) return "YES\n";
    if(L[mid] < C) return binarySearch(C, mid + 1, r, L);
    if(L[mid] > C) return binarySearch(C, l, mid - 1, L);
  }

  return "NO\n";
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll N;
  cin >> N;

  vector<ll> L(N);
  for(ll i = 0; i < N; i++) {
    cin >> L[i];
  }

  sort(L.begin(), L.end());

  int Q;
  cin >> Q;

  ll C;
  for(ll i = 0; i < Q; i++) {
    cin >> C;
    cout << binarySearch(C, 0, N - 1, L);
  }

  return 0;
}
