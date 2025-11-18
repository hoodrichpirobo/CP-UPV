#include <bits/stdc++.h>
using namespace std;

void solve() {
  int N, C, B;
  cin >> N >> C;

  string ans = "NO";
  while(N--) {
    cin >> B;
    
    if(C == B) ans = "YES";
  }

  cout << ans << endl;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int T;
  cin >> T;
  while(T--) {
    solve();
  }

  return 0;
}
