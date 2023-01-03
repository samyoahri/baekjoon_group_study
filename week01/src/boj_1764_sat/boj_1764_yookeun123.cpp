#include <iostream>
#include <string>
using namespace std;


int main() {
	int N, M, cnt = 0;
	cin >> N>>M;
	string *NAME = new string[N+M];
	string* mola = new string[N + M];
	for (int i = 0; i < (N+M); i++) {
		cin >> NAME[i];	
	}
	for (int j = 0; j < N; j++) {
		for (int k = N; k < N + M; k++) {
			if (NAME[j].compare(NAME[k])==0) {
				mola[cnt] = NAME[j];
				cnt++;
			}
		}
	}
	cout << cnt << endl;
	for (int l = 0; l < cnt; l++) {
		cout << mola[l] << endl;
	}
}