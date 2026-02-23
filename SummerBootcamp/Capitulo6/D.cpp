#include <bits/stdc++.h>
using namespace std;
using ll = long long;

void arrow(int i, int n) {
  if(i == n){
    for(int j = 0; j < n; j++) {
      cout << '#';
    }
    cout << '\n';
    return;
  }

  for(int j = 0; j < i; j++) {
    cout << '#';
  }
  cout << '\n';

  arrow(i + 1, n);

  for(int j = 0; j < i; j++) {
    cout << '#';
  }
  cout << '\n';
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int w;
  cin >> w;

  arrow(1, w);

  return 0;
}
