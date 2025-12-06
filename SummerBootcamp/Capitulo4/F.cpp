#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int l;
  cin >> l;
  cin.ignore();

  vector<string> arr(l);
  bool hasJelly = false;
  string line;
  for(int i = 0; i < l; i++) {
    cin >> arr[i];
    for(int j = 0; j < l; j++) {
      if(arr[i][j] == '#') hasJelly = true;
    }
  }

  if(!hasJelly) {
    cout << "NO LLEVABA MERMELADA" << endl;
  } else {
    cin.ignore();

    bool tragedy = false;
    for(int i = 0; i < l; i++) {
      cin >> line;
      for(int j = 0; j < l; j++) {
        if(arr[i][j] != line[j]) {
          cout << "TRAGEDIA" << endl;
          tragedy = true;
          break;
        }
      }
      if(tragedy) break;
    }


    if(!tragedy) cout << "HA HABIDO SUERTE" << endl;
  }

  return 0;
}
