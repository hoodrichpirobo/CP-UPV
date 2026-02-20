#include <bits/stdc++.h>
using namespace std;
using ll = long long;

void countdown(int n) {
  cout << n << endl;
  if(n > 1) countdown(n - 1);
  else return;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  countdown(n);

  return 0;
}
