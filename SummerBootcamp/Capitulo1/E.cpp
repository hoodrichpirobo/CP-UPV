#include <bits/stdc++.h>
#include <cctype>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string s;
  getline(cin, s);

  transform(s.begin(), s.end(), s.begin(), ::tolower);
  cout << s << endl;
  transform(s.begin(), s.end(), s.begin(), ::toupper);
  cout << s << endl;

  return 0;
}
