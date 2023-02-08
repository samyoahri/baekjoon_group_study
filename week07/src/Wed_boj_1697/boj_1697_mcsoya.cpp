#include <iostream>
#include <queue>
#define ARR_MAX 300000

using namespace std;

bool visited[ARR_MAX] = { 0 };

void BFS(int N, int K) {
	visited[N] = 1;
	queue<pair<int, int>> queue;
	queue.push(make_pair(N, 0));

	while (!queue.empty()) {
		pair<int, int> pop = queue.front();
		queue.pop();

		if (pop.first == K) {
			cout << pop.second;
			break;
		}

		if ((pop.first < K)) {
			if (!visited[pop.first * 2]) {
				visited[pop.first * 2] = 1;
				queue.push(make_pair(pop.first * 2, pop.second + 1));
			}
			if (!visited[pop.first + 1]) {
				visited[pop.first + 1] = 1;
				queue.push(make_pair(pop.first + 1, pop.second + 1));
			}
		}
		if ((pop.first > 0) && !visited[pop.first - 1]) {
			visited[N - 1] = 1;
			queue.push(make_pair(pop.first - 1, pop.second + 1));
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, K;	cin >> N >> K;		// Input

	BFS(N, K);					// Solution
}
