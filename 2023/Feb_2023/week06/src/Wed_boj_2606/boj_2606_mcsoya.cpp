#include <iostream>
#include <vector>
#include <queue>
#define ARR_MAX 101

using namespace std;

vector<int> adj[ARR_MAX];
int visited[ARR_MAX] = { 0 };

void BFS(int start, int N) {
	visited[start] = 1;

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
			}
		}
	}
}

void DFS(int start, int N) {
	visited[start] = 1;

	for (int i = 0; i < adj[start].size(); i++) {
		int data = adj[start][i];
		if (visited[data] == 0) {
			DFS(data, N);
		}
	}
}

// ------------------------------------------------------

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M;		// 정점의 수, 간선 개수
	cin >> N >> M;

	int start, end;
	for (int i = 1; i <= M; i++) {
		cin >> start >> end;
		adj[start].push_back(end);
		adj[end].push_back(start);
	}

	//BFS(1, N);
	DFS(1, N);

	// Result
	int result = 0;
	for (int i = 1; i <= N; i++) {
		result += visited[i];
	}

	cout << result - 1;		// 자기 자신을 제외한 결과
}