// 방법 1)
#include <iostream>
#include <queue>
#define ARR_MAX 200001
#define MAX_INT 1000000

using namespace std;

bool visited[ARR_MAX] = { false };

void Das(int N, int K) {
	priority_queue<pair<int, int>> queue;
	queue.push(make_pair(0, N));
	visited[N] = true;

	while (!queue.empty()) {
		int cur_cost = -queue.top().first;
		int cur_pos = queue.top().second;
		queue.pop(); 

		visited[cur_pos] = true;
		if (cur_pos == K) {
			cout << cur_cost;
			break;
		}
		
		// 1) 순간이동 하는 경우 (0초)
		if (cur_pos <= K) {
			int next_pos = cur_pos * 2;
			if (!visited[next_pos]) queue.push(make_pair(-cur_cost, next_pos));
		}

		// 2) x - 1 또는 x + 1로 이동하는 경우 (1초)
		if (cur_pos - 1 >= 0) {
			int next_pos = cur_pos - 1;
			if (!visited[next_pos]) queue.push(make_pair(-(cur_cost + 1), next_pos));
		}

		if (cur_pos + 1 <= K) {
			int next_pos = cur_pos + 1;
			if (!visited[next_pos]) queue.push(make_pair(-(cur_cost + 1), next_pos));
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, K;	// 수빈 위치, 동생 위치
	cin >> N >> K;

	Das(N, K);
}

// ------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------
// 방법 2)
#include <iostream>
#include <queue>
#define ARR_MAX 210001
#define MAX_INT 1000000

using namespace std;

int dist_arr[ARR_MAX];

void Das(int N, int K) {
	dist_arr[N] = 0;
	if (N == K) return;

	priority_queue<pair<int, int>> queue;
	queue.push(make_pair(0, N));

	while (!queue.empty()) {
		int cur_cost = -queue.top().first;
		int cur_pos = queue.top().second;
		queue.pop(); 

		// 1) x - 1 또는 x + 1로 이동하는 경우 (1초)
		if (cur_pos - 1 >= 0) {
			int next_pos = cur_pos - 1;
			int calc = cur_cost + 1;

			if (dist_arr[next_pos] > calc) {
				dist_arr[next_pos] = calc;
				queue.push(make_pair(-calc, next_pos));
			}
		}
		if (cur_pos + 1 <= K) {
			int next_pos = cur_pos + 1;
			int calc = cur_cost + 1;
			
			if (dist_arr[next_pos] > calc) {
				dist_arr[next_pos] = calc;
				queue.push(make_pair(-calc, next_pos));
			}
		}

		// 2) 순간이동 하는 경우 (0초)
		if (cur_pos <= K) {
			int next_pos = cur_pos * 2;
			int calc = cur_cost;

			if (dist_arr[next_pos] > calc) {
				dist_arr[next_pos] = calc;
				queue.push(make_pair(-calc, next_pos));
			}
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, K;	// 수빈 위치, 동생 위치
	cin >> N >> K;

	for (int i = 0; i < ARR_MAX; i++) {
		dist_arr[i] = MAX_INT;
	}

	Das(N, K);

	cout << dist_arr[K];
}
