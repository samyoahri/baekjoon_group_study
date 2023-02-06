#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
#define ARR_MAX 100001

using namespace std;

vector<int> adj[ARR_MAX];
int visited[ARR_MAX] = { 0 };
int result[ARR_MAX] = { 0 };
int cnt = 1;

void BFS(int start, int N) {
	visited[start] = 1;
	result[start] = cnt++;

	queue<int> queue;
	queue.push(start);

	while (!queue.empty()) {
		int pop = queue.front();
		queue.pop();

		for (int i = 0; i < adj[pop].size(); i++) {
			int data = adj[pop][i];
			if (visited[data] == 0) {
				visited[data] = 1;
				queue.push(data);
				result[data] = cnt++;
			}
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M, R;
	cin >> N >> M >> R;

	int start, end;
	for (int i = 1; i <= M; i++) {
		cin >> start >> end;
		adj[start].push_back(end);
		adj[end].push_back(start);
	}

	for (int i = 1; i <= N; i++) {
		sort(adj[i].begin(), adj[i].end(), [](int a, int b) {
			return (a > b);
		});
	}

	BFS(R, N);

	for (int i = 1; i <= N; i++) {
		cout << result[i] << "\n";
	}
}

