#include <iostream>
#include <queue>
#define ARR_MAX 1001

using namespace std;

typedef struct item {
	short x;
	short y;
	bool destroy;	// 파괴 가능한 벽의 개수
	int cnt;		// 이동 횟수

	item(short ux, short uy, bool ud, int ucnt) : x(ux), y(uy), destroy(ud), cnt(ucnt) {}
}Item;

char adj[ARR_MAX][ARR_MAX];
char visited[2][ARR_MAX][ARR_MAX] = { false };
short move_arr[][4] = { {0, -1}, {0, 1}, {-1, 0}, {1, 0} };		// Down, Up, Left, Right
int answer = -1;

void check(queue<Item>& queue, Item pop, int N, int M) {
	for (int i = 0; i < 4; i++) {
		short x = pop.x + move_arr[i][0];
		short y = pop.y + move_arr[i][1];

		if ( (x % (M + 1)) && (y % (N + 1)) ) {
			if (adj[y][x] == 0) {
				if (pop.destroy == true) {
					if (!visited[0][y][x]) {
						queue.push(Item(x, y, pop.destroy, pop.cnt));
						visited[0][y][x] = true;
					}
				}
				else {
					if (!visited[1][y][x]) {
						queue.push(Item(x, y, pop.destroy, pop.cnt));
						visited[1][y][x] = true;
					}
				}
			}
			else {
				if (pop.destroy && !visited[1][y][x]) {
					queue.push(Item(x, y, false, pop.cnt));
					visited[1][y][x] = true;
				}
			}
		}
	}
}

void BFS(short x, short y, int N, int M) {
	visited[0][y][x] = true;

	queue<Item> queue;
	queue.push(Item(x, y, true, 1));

	while (!queue.empty()) {
		Item pop = queue.front();
		queue.pop();

		if ((pop.x == M) && (pop.y == N)) {
			answer = pop.cnt; break;
		}
		pop.cnt += 1;

		check(queue, pop, N, M);
	}
}

// ---------------------------------------------------------------------------------

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M;		// N개의 줄, M개의 숫자
	cin >> N >> M;
	
	char str[ARR_MAX];
	for (int i = 1; i <= N; i++) {
		cin >> str;
		for (int j = 0; j < M; j++) {
			adj[i][j + 1] = str[j] - '0';
		}
	}

	BFS(1, 1, N, M);
	cout << answer;
}
