#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll A, B, C;
  cin >> A >> B >> C;

  ll X = A & B,
     Y = X | C,
     Z = Y ^ B;

  cout << X << ' ' << Y << ' ' << Z << endl;

  return 0;
}
