#include <iostream>
#include <queue>

using namespace std;

void rotate_queue(deque<pair<int, int>>* queue, int number) {
	if (number > 0) {
		for (int i = 1; i <= number - 1; i++) {
			queue->push_back(queue->front());
			queue->pop_front();
		}
	}
	else {
		for (int i = 1; i <= -number; i++) {
			queue->push_front(queue->back());
			queue->pop_back();
		}
	}
}

void send_msg(deque<pair<int, int>>* queue, int* number) {
	*number = queue->front().first;
	printf("%d ", queue->front().second);
	queue->pop_front();
}

//----------------------------------------------------------------

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N;
	cin >> N;

	int data, number;
	deque<pair<int, int>> queue;

	for (int i = 1; i <= N; i++) {
		cin >> data;
		queue.push_back(make_pair(data, i));
	}

	// 1번 풍선 터뜨리고, 적혀있는 값 가져오기
	send_msg(&queue, &number);

	while (!queue.empty()) {
		rotate_queue(&queue, number);
		send_msg(&queue, &number);
	}
	
}