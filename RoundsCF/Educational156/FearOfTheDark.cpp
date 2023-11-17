#include <bits/stdc++.h>
using namespace std;

void solve() {
    long double px, py, ax, ay, bx, by;
    cin >> px >> py >> ax >> ay >> bx >> by;

    long double a_c, b_c, a_p, b_p, a_b;
    a_c = sqrt((ax-px)*(ax-px)+(ay-py)*(ay-py));
    b_c = sqrt((bx-px)*(bx-px)+(by-py)*(by-py));
    a_p = sqrt((ax*ax)+(ay*ay));
    b_p = sqrt((bx*bx)+(by*by));
    a_b = sqrt((ax-bx)*(ax-bx)+(ay-by)*(ay-by));

    long double sola, solb, solab;
    sola = max(a_c, a_p);
    solb = max(b_c, b_p);
    solab = max(min(a_c, b_c), min(a_p, b_p));
    solab = max(solab, a_b/2);

    cout << fixed << setprecision(10) << min(min(sola, solb), solab) << endl;
}



int main() {
	int tt;
    cin >> tt;
    for (int i=0; i<tt; ++i) {
        solve();
    }
}
