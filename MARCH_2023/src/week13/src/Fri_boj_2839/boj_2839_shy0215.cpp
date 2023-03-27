#include <iostream>
using namespace std;

int main() {
	int N;
	int a;
    int b;
	cin >> N;
	a = N / 5;

	while(1) {
		if (a < 0) {
			cout << -1 << endl;
			return 0;
		}
		if ((N - (5 * a)) % 3 == 0) {
			b = (N - (5 * a)) / 3;
			break;
		}
		a--;
	}
	cout << a + b << endl;
    
	return 0;
}