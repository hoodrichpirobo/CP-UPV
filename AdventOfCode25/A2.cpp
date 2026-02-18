#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string line;
  int dial = 50, cnt = 0, v;
  while(cin >> line) {
    v = stoi(line.substr(1));
    if(line[0] == 'L') {
      for(int i = 0; i < v; i++) {
        dial--;
        if(dial == 0) cnt++;
        if(dial < 0) dial = 99;
      }
    } else {
      for(int i = 0; i < v; i++) {
        dial++;
        if(dial > 99) dial = 0;
        if(dial == 0) cnt++;
      }
    }
  }

  cout << cnt << endl;

  return 0;
}
