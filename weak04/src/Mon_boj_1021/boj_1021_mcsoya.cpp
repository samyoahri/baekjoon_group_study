#include <iostream>
#include <queue>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M, pos;
	int cnt = 0, answer = 0;
	cin >> N >> M;

	deque<int> queue;

	// 1. Init
	for (int i = 1; i <= N; i++) queue.push_back(i);

	// 2. Solve
	for (int i = 1; i <= M; i++, cnt = 0) {
		cin >> pos;
		while (queue.front() != pos) {
			queue.push_back(queue.front());
			queue.pop_front();
			cnt++;
		}

		answer += ((cnt < queue.size() - cnt) ? cnt : queue.size() - cnt);
		queue.pop_front();
	}
	cout << answer << "\n";
}