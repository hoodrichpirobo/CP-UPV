#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        vector<pair<int, int>> athletes(n);
        for (int i = 0; i < n; i++) {
            cin >> athletes[i].first >> athletes[i].second;
        }

        int polycarp_strength = athletes[0].first;
        int polycarp_endurance = athletes[0].second;

        // Find the maximum strength of any other athlete 
        // who has endurance greater than or equal to Polycarp
        int max_strength = 0;
        for (int i = 1; i < n; i++) {
            if (athletes[i].second >= polycarp_endurance) {
                max_strength = max(max_strength, athletes[i].first);
            }
        }

        if (max_strength == 0) {
            // If no one else has endurance greater than or equal to Polycarp,
            // we can simply print his strength, since he'll be the only one lifting.
            cout << polycarp_strength << endl;
        } else if (max_strength < polycarp_strength) {
            // If max_strength is less than Polycarp's strength, 
            // then the value of w can be anywhere between max_strength and polycarp_strength.
            // Polycarp will be the only one able to lift the maximum times.
            cout << max_strength + 1 << endl;
        } else {
            cout << -1 << endl; // Impossible case
        }
    }

    return 0;
}
