#include<iostream>
using namespace std;

int main() {
	
	// A : 300초, B : 60초, C : 10초
	int a, b, c = 0;
	int n;
	cin >> n;

	if (n % 10 != 0) cout << "-1";
	else {
		a = n / 300;
		b = (n % 300) / 60;
		c = ((n % 300) % 60) / 10;
		cout << a << " " << b << " " << c;
	}

	return 0;

}