#include <bits/stdc++.h>
using namespace std;

int main(){
  long n, ans = 0;
  cin >> n;

  vector<int> x(n);
  for(int i = 0; i < n; i++){
    cin >> x[i];
    if(i > 0 && x[i - 1] > x[i]){
      ans += (x[i - 1] - x[i]);
      x[i] = x[i - 1];
    }
  }

  cout << ans;

  return 0;
}
