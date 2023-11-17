#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n; cin >>n;
    if (n <= 4) {
        cout << "Bob" << endl;
    }
    else {
        cout << "Alice" << endl;
    }
}

int main() {
    int tt; cin >> tt;
    for (int i=0; i<tt; ++i) {
        solve();
    }
    return 0;
}
