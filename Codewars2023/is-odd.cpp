#include <iostream>

using namespace std;

int isodd(int n)
{
	if (n % 2 == 0)
		cout << "false" << endl;
	else
		cout << "true" << endl;

	return 0;
}

int main()
{
	int n;
	cin >> n;
	isodd(n);
}
