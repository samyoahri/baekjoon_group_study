#include <iostream>
#include <queue>
#define ARR_MAX 4
#define Point pair<int,int>

using namespace std;

int game_map[ARR_MAX][ARR_MAX];
string answer = "Hing";

void BFS(int x, int y, int N) {
	Point point = { x, y };

	queue<Point> queue;
	queue.push(point);

	while (!queue.empty()) {
		Point pop = queue.front(); queue.pop();
		int move = game_map[pop.second][pop.first];

		if ((pop.first == N) && (pop.second == N)) {
			answer = "HaruHaru";
			break;
		}

        if(move > 0) {
		    if (pop.first + move <= N) queue.push({ pop.first + move, pop.second });
		    if (pop.second + move <= N) queue.push({ pop.first, pop.second + move });
        }
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N;		// 게임 구역의 크기
	cin >> N;

	for (int i = 1; i <= N; i++) {
		for (int j = 1; j <= N; j++) {
			cin >> game_map[i][j];
		}
	}
	
	BFS(1, 1, N);
	cout << answer.c_str();
}
