#include <iostream>

using namespace std;

int formula(long long n)
{
	long long numerador;
	long long result;
	numerador = n * (5 * n - 3);
	result = numerador / 2;
	cout << result;
	return result;
}

int main()
{
	long long n;
	cin >> n;
	formula(n);
}
