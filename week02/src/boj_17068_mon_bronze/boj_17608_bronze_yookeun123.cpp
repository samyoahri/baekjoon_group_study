#include <iostream>
#include <string>
using namespace std;


int main() {
	int N, cnt = 0;
	cin >> N;
	int* p = new int[N];
	for (int i = 0; i < N; i++) {
		cin >> p[i];
	}
	int K = 0;
	for (int j = N-1; j > -1; j--) {
		if (K < p[j]) {
			cnt++;
			K = p[j];
		}
	}
	cout << cnt;
	return 0;
}