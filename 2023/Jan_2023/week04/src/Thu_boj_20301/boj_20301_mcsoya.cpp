#include <iostream>
#include <queue>

using namespace std;

void update_queue(deque<int>* queue, int direction) {
	if (direction == 0) {
		queue->push_back(queue->front());
		queue->pop_front();
	}
	else {
		queue->push_front(queue->back());
		queue->pop_back();
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, K, M;		// 사람 수, 반복 단위, 돌리기 조건
	cin >> N >> K >> M;

	deque<int> queue;
	for (int i = 1; i <= N; i++) queue.push_back(i);
	
	int remove = 0;
	int direction = 0;		// 0: Left->Right    1: Right->Left

	while (!queue.empty()) {
		for (int i = 1; i <= K - !direction; i++) {
			update_queue(&queue, direction);
		}
		if (++remove % M == 0) direction = !direction;

		cout << queue.front() << "\n";
		queue.pop_front();
	}
}