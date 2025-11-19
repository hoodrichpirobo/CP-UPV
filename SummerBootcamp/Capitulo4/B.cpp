#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int N;
  cin >> N;

  int H[N];
  int curr;
  for(int i = 0; i < N; i++) {
    cin >> curr;
    H[i] = curr;
  }

  for(int i = 0; i < N; i++) {
    cin >> curr;
    H[i] += curr;
    cout << H[i] << ' ';
  }

  return 0;
}
