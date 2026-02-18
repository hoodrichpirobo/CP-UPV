#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll cnt = 0;
  string line;
  cin >> line;

  stringstream ss(line);
  string token;

  while(getline(ss, token, ',')) {    // tuve que aprender a hacer esto en .cc viendo el codigo de dani :(
    int idx = token.find('-');
    ll start = stoll(token.substr(0, idx));
    ll end = stoll(token.substr(idx + 1));

    while(start<=end) {
      string las = to_string(start);
      int size = las.length();

      if(size % 2 == 0) {
        string first = las.substr(0, size/2),
               second = las.substr(size/2);

        if(first == second) cnt += start;

        start++;
      } else {
        ll next = 1;
        for(int i = 0; i < to_string(start).length(); i++) {
          next *= 10;
        }

        start = next;
      }
    }
  }

  cout << cnt << endl;

  return 0;
}
