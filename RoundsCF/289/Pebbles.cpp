#include <bits/stdc++.h>
using namespace std;
int main(){
    int n,k,c; cin >> n >> k;
    int min=101, max=0;
    bool res=true;
    int arr[n];
    for (int i = 0; i < n; ++i) {
        cin >> c;
        arr[i]= c;
        if (min > c){
            min = c;
        }
        if (max < c){
            max = c;
        }
    }

    if (max - min > k) {
        res= false ;
    }
    if (!res)
    {
        cout << "NO";

    } else {
        cout << "YES" << endl;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < arr[i]; ++j) {
                 cout << j % k + 1 << " ";
            }cout << endl;

        }
    }
}
