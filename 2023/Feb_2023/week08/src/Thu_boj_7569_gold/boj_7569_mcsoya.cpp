#include <iostream>
#include <queue>
#define ARR_MAX 101

using namespace std;

typedef struct item {
	short x;
	short y;
	short z;
	int cnt;
	item(short ix, short iy, short iz, int icnt) : x(ix), y(iy), z(iz), cnt(icnt) {}
}Item;

short tomato_Box[ARR_MAX][ARR_MAX][ARR_MAX] = { false };

void check(queue<Item>& queue, Item point, int N, int M, int H) {
	// 위쪽으로 이동할 수 있는가?
	if ((point.y - 1 > 0) && (tomato_Box[point.z][point.y - 1][point.x] == 0)) {
		queue.push(Item(point.x, point.y - 1, point.z, point.cnt + 1));
		tomato_Box[point.z][point.y - 1][point.x] = 1;
	}

	// 아래쪽으로 이동할 수 있는가?
	if ((point.y + 1 <= M) && (tomato_Box[point.z][point.y + 1][point.x] == 0)) {
		queue.push(Item(point.x, point.y + 1, point.z, point.cnt + 1));
		tomato_Box[point.z][point.y + 1][point.x] = 1;
	}

	// 왼쪽으로 이동할 수 있는가?
	if ((point.x - 1 > 0) && (tomato_Box[point.z][point.y][point.x - 1] == 0)) {
		queue.push(Item(point.x - 1, point.y, point.z, point.cnt + 1));
		tomato_Box[point.z][point.y][point.x - 1] = 1;
	}

	// 오른쪽으로 이동할 수 있는가?
	if ((point.x + 1 <= N) && (tomato_Box[point.z][point.y][point.x + 1] == 0)) {
		queue.push(Item(point.x + 1, point.y, point.z, point.cnt + 1));
		tomato_Box[point.z][point.y][point.x + 1] = 1;
	}



	// 1층 아래로 갈 수 있는가?
	if ((point.z + 1 <= H) && (tomato_Box[point.z + 1][point.y][point.x] == 0)) {
		queue.push(Item(point.x, point.y, point.z + 1, point.cnt + 1));
		tomato_Box[point.z + 1][point.y][point.x] = 1;
	}

	// 1층 위로 갈 수 있는가?
	if ((point.z - 1 > 0) && (tomato_Box[point.z - 1][point.y][point.x] == 0)) {
		queue.push(Item(point.x, point.y, point.z - 1, point.cnt + 1));
		tomato_Box[point.z - 1][point.y][point.x] = 1;
	}
}

int BFS(queue<Item>& queue, int N, int M, int H) {
	Item point = Item(0, 0, 0, -1);

	while (!queue.empty()) {
		point = queue.front(); queue.pop();
		check(queue, point, N, M, H);
	}

	return point.cnt;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M, H;		// 가로 길이, 세로 길이, 높이
	cin >> N >> M >> H;

	queue<Item> queue;
	for (int i = 1; i <= H; i++) {
		for (int j = 1; j <= M; j++) {
			for (int k = 1; k <= N; k++) {
				cin >> tomato_Box[i][j][k];
				if (tomato_Box[i][j][k] == 1) queue.push(Item(k, j, i, 0));
			}
		}
	}

	int result = BFS(queue, N, M, H);

	for (int i = 1; i <= H; i++) {
		for (int j = 1; j <= M; j++) {
			for (int k = 1; k <= N; k++) {
				if (tomato_Box[i][j][k] == 0) {
					result = -1;
					break;
				}
			}
		}
	}

	cout << result;
}
