#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int N, P;
  cin >> N >> P;

  int arr1[P];
  string arr2[P];
  for(int i = 0; i < P; i++) {
    cin >> arr1[i];

    int comp = abs(N - arr1[i]);

    if(!comp) {
      cout << "1p ";
    } else if(comp <= 5) {
      cout << "0.5p ";
    } else if(comp <= 10) {
      cout << "0.25p ";
    } else {
      cout << "0p ";
    }
  }

  return 0;
}
