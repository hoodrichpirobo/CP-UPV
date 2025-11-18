#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int E, prev = -1, comp;
  while(cin >> E){
    if(prev != -1) {
      comp = prev - E;
      if(comp < 0) {
        cout << 'S';
      } else if(comp > 0) {
        cout << 'B';
      } else {
        cout << 'I';
      }
    }

    prev = E;
  }

  return 0;
}
