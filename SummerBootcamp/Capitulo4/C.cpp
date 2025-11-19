#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll N;
  cin >> N;

  int A[N];
  int B[N];
  int each;
  for(int i = 0; i < N; i++) {
    cin >> each;
    A[i] = each;
  }

  for(int i = 0; i < N; i++) {
    cin >> each;
    B[i] = each;
  }

  for(int i = 0; i < N; i++) {
    if(i % 2 == 0) {
      cout << A[i] << ' ';
    } else {
      cout << B[i] << ' ';
    }
  }
  cout << endl;

  for(int i = 0; i < N; i++) {
    if(i % 2 == 0) {
      cout << B[i] << ' ';
    } else {
      cout << A[i] << ' ';
    }
  }
  cout << endl;

  return 0;
}
