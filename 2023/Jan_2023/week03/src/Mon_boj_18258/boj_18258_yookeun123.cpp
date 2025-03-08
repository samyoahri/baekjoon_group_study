#include <iostream>
#include <stdio.h>
#include <queue>
using namespace std;


int main() {
	cin.tie(NULL);
	cin.sync_with_stdio(false);
	int N, X;
	string word;
	queue<int> qu;
	cin >> N;
	
	for (int i = 0; i < N; i++) {
		cin >> word;
		if (word == "push") {
			cin >> X;
			qu.push(X);
		}
		else if (word == "pop") {
			if (!qu.empty()) {
				cout << qu.front() << '\n';
				qu.pop();
			}
			else
				cout << -1 << '\n';
		}
		else if (word == "size")
			cout << qu.size() << '\n';
		else if (word == "empty") {
			cout << qu.empty() << '\n';
			
		}
		else if (word == "front") {
			if (!qu.empty())
				cout << qu.front() << '\n';
			else
				cout << -1 << '\n';
			
		}
		else if (word == "back") {
			if (!qu.empty())
				cout << qu.back() << '\n';
			else
				cout << -1 << '\n';
			
		}
	}
	return 0;
}
// '\n' 하니까 시간초과 해결되는거 신세계 ㄷㄷ
