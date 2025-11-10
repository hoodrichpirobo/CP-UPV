#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  double a;
  string s, b;
  cin >> a;
  getline(cin, s);

  getline(cin, s);
  cin >> b;

  cout << s << ": " << setprecision(3) << fixed << a << endl;
  cout << b << endl;

  return 0;
}
