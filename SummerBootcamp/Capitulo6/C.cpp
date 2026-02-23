#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int triangular(int n) {
  if(n == 1) return n;
  return n + triangular(n - 1);
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  cout << triangular(n) << endl;

  return 0;
}
