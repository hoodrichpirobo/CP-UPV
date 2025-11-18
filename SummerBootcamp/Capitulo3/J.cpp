#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll N, sum = 0;
  while(cin >> N) {
    sum += N;
    cout << sum << ' ';
  }

  return 0;
}
