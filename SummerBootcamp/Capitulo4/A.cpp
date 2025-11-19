#include <bits/stdc++.h>
using namespace std;
using ll = long long;

string vowels = "aeiou";

void solve() {
  string s;
  getline(cin, s);

  int m = s.length(), v = 0, sp = 0;
  for(int i = 0; i < m; i++) {
    if(s[i] == ' ') {
      sp++;
      continue;
    }
    for(int j = 0; j < 5; j++) {
      if(s[i] == vowels[j]) v++;
    }
  }

  m -= sp;

  cout << v << ' ' << m << endl;
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
