#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string line, ans = "";
  while(getline(cin, line)) {
    if(line.length() % 2 == 0) {
      for(int i = line.length() - 1; i >= 0; i--) {
        ans += line[i];
      }
      ans += '\n';
    } else {
      ans += line;
      ans += '\n';
    }
  }

  cout << ans;

  return 0;
}
