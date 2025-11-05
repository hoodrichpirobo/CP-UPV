#include <bits/stdc++.h>
using namespace std;

int main(){
  char i;
  int a, c, g, t, current, M = INT_MIN;
  a = c = g = t = current = 0;

  while(cin >> i){
    switch(i){
      case 'A':
        a++;
        current = a;
        c = g = t = 0;
        break;
      case 'C':
        c++;
        current = c;
        a = g = t = 0;
        break;
      case 'G':
        g++;
        current = g;
        a = c = t = 0;
        break;
      case 'T':
        t++;
        current = t;
        a = c = g = 0;
        break;
    }
    M = max(M, current);
  }

  cout << M;

  return 0;
}
