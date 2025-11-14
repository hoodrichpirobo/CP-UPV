#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string s, ans = "Vienen a pasear: ";
  getline(cin, s);

  int t;
  cin >> t;

  if(s == "Soleado" && t >= 20) ans += "Adrian ";
  if(s == "Soleado" || t > 15) ans += "Barbara ";
  if(s == "Soleado" || s == "Nublado") ans += "Carmen ";
  if(s != "Tormenta") ans += "Dario ";

  cout << ans << endl;

  return 0;
}
