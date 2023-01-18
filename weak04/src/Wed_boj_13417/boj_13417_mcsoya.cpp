#include <iostream>
#include <queue>
#include <functional>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int T;		// 테스트 데이터의 개수
	cin >> T;

	int N;
	char ch;
	deque<char> queue;

	for (int i = 1; i <= T; i++) {
		cin >> N;
		for (int j = 1; j <= N; j++) {
			cin >> ch;
			if(queue.empty()) queue.push_front(ch);
			else if (ch <= queue.front()) queue.push_front(ch);
			else queue.push_back(ch);
		}

		for (int j = 1; j <= N; j++) {
			cout << queue.front();
			queue.pop_front();
		}
		cout << endl;
	}
}