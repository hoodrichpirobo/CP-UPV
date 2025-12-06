#include <bits/stdc++.h>
using namespace std;
using ll = long long;

string ans;

int out(string line) {
  ans = "";
  for(int i = 0; i < line.length(); i++) {
    if(line[i] != ' ') {
      ans += "* ";
      ans += line[i];
      ans += ' ';
    } else {
      ans += "**";
    }
  }

  ans += '*';
  
  return ans.length();
}

void solve() {
  string line;
  getline(cin, line);

  int m = out(line);
  
  string header = "";
  for(int i = 0; i <= m; i++) {
    if(i == m) header += '\n';
    else header += '*';
  }

  cout << header;
  cout << ans << endl;
  cout << header;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll n;
  cin >> n;
  cin.ignore();

  while(n--) {
    solve();
  }

  return 0;
}
