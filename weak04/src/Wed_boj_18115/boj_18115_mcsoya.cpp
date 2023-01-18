#include <iostream>
#include <queue>

using namespace std;

void init_card(deque<int>* queue, int len) {
	for (int i = 1; i <= len; i++) queue->push_back(i);
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N;		// 카드 개수
	cin >> N;

	int data;	// 어떤 기술을 사용했는가?
	deque<int> input_queue;
	deque<int> queue; init_card(&queue, N);
	deque<int> result;

	for (int i = 1; i <= N; i++) {
		cin >> data;
		input_queue.push_back(data);
	}

	while(!input_queue.empty()) {
		int local_data = input_queue.back();
		input_queue.pop_back();

		if (local_data == 1) {
			// front에 있는 카드를 덱의 front로 이동
			result.push_front(queue.front());
		}
		else if (local_data == 2) {
			// front에 있는 카드를 덱의 front-2로 이동
			int tmp = result.front();
			
			result.pop_front();
			result.push_front(queue.front());
			result.push_front(tmp);
		}
		else if (local_data == 3) {
			// front에 있는 카드를 덱의 back으로 이동
			result.push_back(queue.front());
		}
		queue.pop_front();
	}
	
	// 출력
	while(!result.empty()) {
		cout << result.front() << " ";
		result.pop_front();
	}
	
}