// Importar librería con utilidades
#include <bits/stdc++.h>
#include <string.h>

// Para especificar por ejemplo que 'cout' pertenece a lalibrería estandar
using namespace std;

// Las typedef sirven para poder referirse a un tipo de variable con otro nombre (uno más corto por conveniencia)
typedef long long ll;
typedef unsigned long long ull;

// Las macros sirven para referirse a una expresión con un nombre más corto, hay algunos ejemplos más abajo
#define flush std::cout << endl //flusheamos
#define sdl std::cout << "\n" //salto de linea
#define REP(i, a, b) for (int i = a; i < b; ++i) //recorre
#define REPV(i, a, b) for (int i = a; i >= b; --i) //recorre pero al revés
#define MOD 1000000007 //para numeros grandes
#define TESTCASES false



int main(){
    int n; cin >> n;
    int tabla[n][n];
    REP(i,0,n){
        tabla[0][i]=1;
    }
    REP(i,1,n){
        tabla[i][0]=1;
        REP(j,1,n){
            tabla[i][j]=tabla[i-1][j]+tabla[i][j-1];
        }
    }
    cout << tabla[n-1][n-1];
}
