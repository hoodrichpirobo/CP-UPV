#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int ans;
  double N, D;
  char op;
  cin >> N >> op >> D;

  switch(op){
    case '+':
      ans = N + D; break;
    case '-':
      ans = N - D; break;
    case '*':
      ans = N * D; break;
    case '/':
      if(D != 0) cout << setprecision(2) << fixed << N / D << endl;
      else cout << "ERROR" << endl;
      return 0;
  }

  cout << ans << endl;

  return 0;
}
