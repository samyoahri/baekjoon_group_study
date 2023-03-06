#include <iostream>
#include <queue>
#define ARR_MAX 301

using namespace std;

typedef struct point {
	int x;
	int y;
	int cnt;

	point(int dx, int dy, int dcnt) : x(dx), y(dy), cnt(dcnt) {}
}Point;

void BFS(bool visited[][ARR_MAX], int x, int y, int target_x, int target_y, int max) {
	visited[y][x] = 1;
	queue<Point> queue;
	queue.push(Point(x, y, 0));

	while (!queue.empty()) {
		Point pop = queue.front();
		queue.pop();

		// Exit Condition
		if ((pop.x == target_x) && (pop.y == target_y)) {
			cout << pop.cnt << "\n";
			break;
		}

		// Top - Left
		if ((pop.x - 1 >= 0) && (pop.y - 2 >= 0)) {
			if (!visited[pop.y - 2][pop.x - 1]) {
				visited[pop.y - 2][pop.x - 1] = 1;
				queue.push(Point(pop.x - 1, pop.y - 2, pop.cnt + 1));
			}
		}
		if ((pop.x - 2 >= 0) && (pop.y - 1 >= 0)) {
			if (!visited[pop.y - 1][pop.x - 2]) {
				visited[pop.y - 1][pop.x - 2] = 1;
				queue.push(Point(pop.x - 2, pop.y - 1, pop.cnt + 1));
			}
		}

		// Bottom - Left
		if ((pop.x - 1 >= 0) && (pop.y + 2 < max)) {
			if (!visited[pop.y + 2][pop.x - 1]) {
				visited[pop.y + 2][pop.x - 1] = 1;
				queue.push(Point(pop.x - 1, pop.y + 2, pop.cnt + 1));
			}
		}
		if ((pop.x - 2 >= 0) && (pop.y + 1 < max)) {
			if (!visited[pop.y + 1][pop.x - 2]) {
				visited[pop.y + 1][pop.x - 2] = 1;
				queue.push(Point(pop.x - 2, pop.y + 1, pop.cnt + 1));
			}
		}


		// Top - Right
		if ((pop.x + 1 < max) && (pop.y - 2 >= 0)) {
			if (!visited[pop.y - 2][pop.x + 1]) {
				visited[pop.y - 2][pop.x + 1] = 1;
				queue.push(Point(pop.x + 1, pop.y - 2, pop.cnt + 1));
			}
		}
		if ((pop.x + 2 < max) && (pop.y - 1 >= 0)) {
			if (!visited[pop.y - 1][pop.x + 2]) {
				visited[pop.y - 1][pop.x + 2] = 1;
				queue.push(Point(pop.x + 2, pop.y - 1, pop.cnt + 1));
			}
		}


		// Bottom - Right
		if ((pop.x + 2 < max) && (pop.y + 1 < max)) {
			if (!visited[pop.y + 1][pop.x + 2]) {
				visited[pop.y + 1][pop.x + 2] = 1;
				queue.push(Point(pop.x + 2, pop.y + 1, pop.cnt + 1));
			}
		}
		if ((pop.x + 1 < max) && (pop.y + 2 < max)) {
			if (!visited[pop.y + 2][pop.x + 1]) {
				visited[pop.y + 2][pop.x + 1] = 1;
				queue.push(Point(pop.x + 1, pop.y + 2, pop.cnt + 1));
			}
		}
	}
}

// -----------------------------------------------------------------------

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N;						// 테스트 케이스의 개수
	int I;						// 체스판의 한 변의 길이
	int x, y;					// 나이트가 현재 있는 칸
	int target_x, target_y;		// 나이트가 이동하려고 하는 칸

	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> I;
		cin >> x >> y;
		cin >> target_x >> target_y;

		bool visited[ARR_MAX][ARR_MAX] = { 0 };
		BFS(visited, x, y, target_x, target_y, I);
	}
}
