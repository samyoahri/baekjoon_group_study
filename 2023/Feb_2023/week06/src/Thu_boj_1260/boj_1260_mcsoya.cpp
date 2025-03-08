#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#define ARR_MAX 1001

using namespace std;

int visited[ARR_MAX];
vector<int> adj[ARR_MAX];

void init() {
	for (int i = 1; i <= ARR_MAX; i++) {
		visited[i] = 0;
	}
}

void DFS(int start, int N) {
	visited[start] = 1;
	cout << start << " ";
	for (int i = 0; i < adj[start].size(); i++) {
		int data = adj[start][i];
		if (visited[data] == 0) {
			DFS(data, N);
		}
	}
}

void BFS(int start, int N) {
	visited[start] = 1;
	cout << start << " ";

	queue<int> queue;
	queue.push(start);

	while (!queue.empty()) {
		int pop = queue.front();
		queue.pop();

		for (int i = 0; i < adj[pop].size(); i++) {
			int data = adj[pop][i];
			if (visited[data] == 0) {
				cout << data << " ";
				queue.push(data);
				visited[data] = 1;
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
		sort(adj[i].begin(), adj[i].end());
	}

	DFS(R, N);	// DFS
	init();
	cout << "\n";
	BFS(R, N);	// BFS
}
