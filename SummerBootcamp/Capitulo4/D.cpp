#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, m;
  cin >> n >> m;
  cin.ignore();

  vector<bool> row(n);
  vector<bool> col(m);
  string line;
  
  for(int i = 0; i < n; i++) {
    getline(cin, line);
    for(int j = 0; j < m; j++) {
      if(line[j] == '#') {
        row[i] = true;
        col[j] = true;
      }
    }
  }

  for(int i = 0; i < n; i++) {
    line = "";
    for(int j = 0; j < m; j++) {
      if(row[i] || col[j]){
        line += '#';
      } else {
        line += '.';
      }
    }
    cout << line << endl;
  }

  return 0;
}
