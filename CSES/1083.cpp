#include <bits/stdc++.h>
using namespace std;

int main(){
  int n, j;
  cin >> n;
  vector<int> a(n+1);
  for(int i = 0; i <= n; ++i){
    a[i] = i;
  }

  for(int i = 0; i < n - 1; ++i){
    cin >> j;
    a[j] = INT_MAX;
  }

  sort(a.begin(), a.end());

  cout << a[1];

  return 0;
}
