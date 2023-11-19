#include <iostream>
#include <string>
using namespace std;

typedef long long int ll;

int main() {
    ll t;
    cin >> t;
    while(t--) {
        ll n, k;
        cin >> n >> k;
        string s;
        cin >> s;
        ll count_B = 0;
        ll leng = s.length();
        for(ll i = 0; i < leng; i++) {
            if(s[i] == 'B') count_B++;
        }
        if(count_B == k) {
            cout << 0 << endl;
        } else {
            if(count_B < k) {
                ll count = 0;
                for(ll i = 0; i < leng; i++) {
                    if(s[i] == 'A') {
                        count++;
                    }
                    if(count == k - count_B) {
                        cout << 1 << endl << i+1 << ' ' << 'B' << endl;
                        break;
                    }
                }
            } else {
                ll count = 0;
                for(ll i = 0; i < leng; i++) {
                    if(s[i] == 'B') {
                        count++;
                    }
                    if(count == count_B - k) {
                        cout << 1 << endl << i + 1 << ' ' << 'A' << endl;
                        break;
                    }
                }
            }
        }
    }
    return 0;
}
