#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#define ARR_MAX 100001

using namespace std;

vector<int> adj[ARR_MAX];		// 인접 리스트
int visited[ARR_MAX] = { 0 };	// 방문 여부
int result[ARR_MAX] = { 0 };
int cnt = 1;	// 방문 순서

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
				result[data] = cnt++;

				visited[data] = 1;
				queue.push(data);
			}
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M, R;		// 정점 개수, 간선 개수, 시작 정점
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

	BFS(R, N);
	for (int i = 1; i <= N; i++) {
		cout << result[i] << "\n";
	}
}