#include <iostream>
#include <vector>
#define ARR_MAX 101

using namespace std;

bool visited[ARR_MAX][ARR_MAX] = { false };
int cnt = 0;
int umax = 0;

void DFS(int x, int y) {
	visited[y][x] = false;
	cnt++;

	if ((y - 1 > 0) && visited[y - 1][x]) DFS(x, y - 1);
	if ((y + 1 < ARR_MAX) && visited[y + 1][x]) DFS(x, y + 1);
	if ((x - 1 > 0) && visited[y][x - 1]) DFS(x - 1, y);
	if ((x + 1 < ARR_MAX) && visited[y][x + 1]) DFS(x + 1, y);

}

void solution() {
	for (int i = 1; i < ARR_MAX; i++) {
		for (int j = 1; j < ARR_MAX; j++) {
			if (visited[i][j]) {
				cnt = 0;
				DFS(j, i);
				if (umax < cnt) umax = cnt;
			}
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M, K;	// 세로 길이, 가로 길이, 음식물 쓰레기 개수
	int r, c;		// 떨어진 좌표 (r, c)

	cin >> N >> M >> K;
	for (int i = 1; i <= K; i++) {
		cin >> r >> c;
		visited[r][c] = 1;
	}

	solution();
	cout << umax << "\n";
}
