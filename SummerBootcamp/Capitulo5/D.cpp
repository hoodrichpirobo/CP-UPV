#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll N;
  cin >> N;

  vector<pair<int,int>> v(N);
  for(int i = 0; i < N; i++) {
    cin >> v[i].first >> v[i].second;
  }

  sort(v.begin(), v.end(), 
      [](const pair<int, int>& a, const pair<int, int>& b){
      if(a.first != b.first) return a.first > b.first;
      return a.second < b.second;
      });

  for(int i = 0; i < N; i++) {
    cout << v[i].first << ' ' << v[i].second << '\n';
  }

  return 0;
}
