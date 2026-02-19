#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int N;
  cin >> N;

  vector<int> A(N);
  for(int i = 0; i < N; i++) {
    cin >> A[i];
  }

  sort(A.begin(), A.end());

  int smallest = INT_MAX;

  for(int i = 1; i < N; i++) {
    smallest = min(smallest, A[i] - A[i - 1]);
  }

  cout << smallest << endl;

  return 0;
}
