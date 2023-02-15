#include <iostream>
#include <queue>
#define ARR_MAX 1001

using namespace std;

typedef struct item {
	short x;
	short y;
	int cnt;
	item(int ix, int iy, int icnt) : x(ix), y(iy), cnt(icnt) {}
}Item;

short tomato_Box[ARR_MAX][ARR_MAX] = { false };

void check(queue<Item>& queue, Item point, int N, int M) {
	// 위쪽으로 이동할 수 있는가?
	if ((point.y - 1 > 0) && (tomato_Box[point.y - 1][point.x] == 0)) {
		queue.push(Item(point.x, point.y - 1, point.cnt + 1));
		tomato_Box[point.y - 1][point.x] = 1;
	}

	// 아래쪽으로 이동할 수 있는가?
	if ((point.y + 1 <= M) && (tomato_Box[point.y + 1][point.x] == 0)) {
		queue.push(Item(point.x, point.y + 1, point.cnt + 1));
		tomato_Box[point.y + 1][point.x] = 1;
	}

	// 왼쪽으로 이동할 수 있는가?
	if ((point.x - 1 > 0) && (tomato_Box[point.y][point.x - 1] == 0)) {
		queue.push(Item(point.x - 1, point.y, point.cnt + 1));
		tomato_Box[point.y][point.x - 1] = 1;
	}

	if ((point.x + 1 <= N) && (tomato_Box[point.y][point.x + 1] == 0)) {
		queue.push(Item(point.x + 1, point.y, point.cnt + 1));
		tomato_Box[point.y][point.x + 1] = 1;
	}
}

int BFS(queue<Item>& queue, int N, int M) {
	Item point = Item(0, 0, -1);

	while (!queue.empty()) {
		point = queue.front(); queue.pop();
		check(queue, point, N, M);
	}

	return point.cnt;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M;		// 가로 길이, 세로 길이
	cin >> N >> M;

	for (int i = 1; i <= M; i++) {
		for (int j = 1; j <= N; j++) {
			cin >> tomato_Box[i][j];
		}
	}

	queue<Item> queue;
	for (int i = 1; i <= M; i++) {
		for (int j = 1; j <= N; j++) {
			if (tomato_Box[i][j] == 1) {
				queue.push(Item(j, i, 0));
			}
		}
	}

	int result = BFS(queue, N, M);
	for (int i = 1; i <= M; i++) {
		for (int j = 1; j <= N; j++) {
			if (tomato_Box[i][j] == 0) {
				result = -1;
				break;
			}
		}
	}

	cout << result;
}
