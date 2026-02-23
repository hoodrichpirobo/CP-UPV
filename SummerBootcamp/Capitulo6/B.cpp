#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int fib(int n) {
  if(n <= 2) return 1;

  return fib(n - 1) + fib(n - 2);
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  cout << fib(n) << endl;

  return 0;
}
