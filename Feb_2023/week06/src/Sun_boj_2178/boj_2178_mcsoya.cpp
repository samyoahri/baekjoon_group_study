#include <iostream>
#include <queue>
#include <vector>
#include <cstring>
#define ARR_MAX 101

using namespace std;

typedef struct item {
	int x;
	int y;
	int cnt;
}Item;

int visited[ARR_MAX][ARR_MAX];

void change_visited(queue<Item>& queue, int x, int y, int cnt, int N, int M) {
	// 1) 상단 비교
	if ((y > 1) && (visited[y - 1][x])) {
		queue.push({ x, y - 1, cnt + 1 });
		visited[y - 1][x] = 0;
	}

	// 2) 하단 비교
	if ((y < N) && (visited[y + 1][x])) {
		queue.push({ x, y + 1, cnt + 1 });
		visited[y + 1][x] = 0;
	}

	// 3) 좌측 비교
	if ((x > 1) && (visited[y][x - 1])) {
		queue.push({ x - 1, y, cnt + 1 });
		visited[y][x - 1] = 0;
	}

	// 4) 우측 비교
	if ((x < M) && (visited[y][x + 1])) {
		queue.push({ x + 1, y, cnt + 1 });
		visited[y][x + 1] = 0;
	}
}

void BFS(int x, int y, int N, int M) {
	visited[y][x] = 0;

	queue<Item> queue;
	queue.push({ x, y, 1 });
	
	while (!queue.empty()) {
		Item pop = queue.front();
		queue.pop();

		if ((pop.x == M) && (pop.y == N)) {
			cout << pop.cnt;
			break;
		}

		change_visited(queue, pop.x, pop.y, pop.cnt, N, M);
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M;
	cin >> N >> M;

	char str[101];
	for (int i = 1; i <= N; i++) {
		cin >> str;

		int len = strlen(str);
		for (int j = 0; j < len; j++) {
			visited[i][j + 1] = (str[j] - '0');
		}
	}

	BFS(1, 1, N, M);
}
