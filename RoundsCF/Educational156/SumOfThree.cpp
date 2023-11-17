#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

void solve() {
    int n; cin >> n;
    if (n < 7 || n == 9) {
        cout << "NO" << endl;
        return;
    }

    if (n % 3 == 0) {
        cout << "YES" << endl;
        cout << "1 4 " << n-5 << endl;
    }
    else {
        cout << "YES" << endl;
        cout << "1 2 " << n-3 << endl;
    }
}



int main() {
	int tt;
    cin >> tt;
    for (int i=0; i<tt; ++i) {
        solve();
    }
}
