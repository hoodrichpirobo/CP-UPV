#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll P, V, ans = 0;
  cin >> P >> V;

  char V_i, V_j;
  for(int i = 0; i < P; i++) {
    for(int j = 0; j < V; j++) {
      cin >> V_i >> V_j;

      if(V_i == '#' || V_j == '#') ans++;
    }
  }

  cout << ans << endl;

  return 0;
}
