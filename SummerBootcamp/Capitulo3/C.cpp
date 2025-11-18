#include <bits/stdc++.h>
using namespace std;

double PI = 3.141592;

double triangle() {
  double B, A;
  cin >> B >> A;
  return (B*A)/2;
}

double rectangle() {
  double X, Y;
  cin >> X >> Y;
  return X * Y;
}

double square() {
  double X;
  cin >> X;
  return X * X;
}

double circle() {
  double R;
  cin >> R;
  return PI * R * R;
}

void solve() {
  int F;
  double ans;
  cin >> F;

  switch(F){
    case 1:
      ans = circle();
      break;
    case 2:
      ans = square();
      break;
    case 3:
      ans = rectangle();
      break;
    default:
      ans = triangle();
      break;
  }

  cout << setprecision(5) << fixed << ans << endl;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int N;
  cin >> N;
  while(N--) {
    solve();
  }

  return 0;
}
