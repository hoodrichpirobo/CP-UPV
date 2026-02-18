#include <bits/stdc++.h>
using namespace std;
using ll = long long;

string even = "WBWBWBWB",
       odd = "BWBWBWBW";

void solve() {
  char c;
  for(int i = 0; i < 8; i++) {
    for(int j = 0; j < 8; j++) {
      cin >> c;
      if(i%2==0){
        if(c == even[j]) cout << c;
        else cout << 'X';
      } else {
        if(c == odd[j]) cout << c;
        else cout << 'X';
      }
    }
    cout << '\n';
  }
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll TC;
  cin >> TC;
  while(TC--){
    solve();
  }

  return 0;
}
