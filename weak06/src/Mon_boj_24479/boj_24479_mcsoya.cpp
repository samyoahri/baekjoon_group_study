#include <iostream>
#include <vector>
#include <algorithm>
#define ARR_MAX 100001

using namespace std;

int cnt = 1;
int result[ARR_MAX] = { 0 };

void dfs(int visited[], vector<int> adj[], int start) {
	visited[start] = 1;
	result[start] = cnt++;

	for (int i = 0; i < adj[start].size(); i++) {
		int new_start = adj[start][i];
		if (visited[new_start] == 0) dfs(visited, adj, new_start);
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M, R;
	cin >> N >> M >> R;

	int visited[ARR_MAX] = { 0 };
	vector<int> adj[ARR_MAX];

	int start, end;
	for (int i = 1; i <= M; i++) {
		cin >> start >> end;
		adj[start].push_back(end);
		adj[end].push_back(start);
	}


	for (int i = 1; i <= N; i++) {
		sort(adj[i].begin(), adj[i].end());
	}
	
	dfs(visited, adj, R);

	for (int i = 1; i <= N; i++) {
		cout << result[i] << "\n";
	}
	
}