#include <iostream>
#define ARR_MAX 51

using namespace std;

char adj[ARR_MAX][ARR_MAX];
bool visited[ARR_MAX][ARR_MAX] = { false };

void DFS(int x, int y, int N, int M) {
	if (!visited[y][x]) {
		visited[y][x] = true;

		if ((adj[y][x] == '-') && (adj[y][x + 1] == '-') && (x + 1 < M)) {
			DFS(x + 1, y, N, M);
		}
		if ((adj[y][x] == '|') && (adj[y + 1][x] == '|') && (y + 1 <= N)) {
			DFS(x, y + 1, N, M);
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M;	// 세로 길이 , 가로 길이
	cin >> N >> M;

	for (int i = 1; i <= N; i++) {
		cin >> adj[i];
	}

	int answer = 0;
	for (int i = 1; i <= N; i++) {
		for (int j = 0; j < M; j++) {
			if (!visited[i][j]) {
				DFS(j, i, N, M);
				answer++;
			}
		}
	}
	
	cout << answer;
}
