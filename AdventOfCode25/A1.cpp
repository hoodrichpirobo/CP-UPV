#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string line;
  int dial = 50, cnt = 0, v;
  while(cin >> line) {
    v = stoi(line.substr(1, line.length()));
    if(line[0] == 'L') {
      dial = (dial - v) % 100;
    } else {
      dial = (dial + v) % 100;
    }

    if(dial == 0) cnt++;
  }

  cout << cnt << endl;

  return 0;
}
