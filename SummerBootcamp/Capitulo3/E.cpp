#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string N;
  cin >> N;

  int sum = 0;
  for(int i = 0; i < N.length(); i++) {
    sum += (N[i] - '0');
  }

  cout << sum;
  
  return 0;
}
