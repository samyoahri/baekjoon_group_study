#include <iostream>
#include <queue>
#define ARR_MAX 101
#define PSI pair<short, short>

short game_Map[ARR_MAX] = { 0 };		// -1 초기값 : init 필요
bool visited[ARR_MAX] = { false };

using namespace std;

void BFS(short start, short end) {
	visited[start] = true;

	queue<PSI> queue;
	queue.push(make_pair(start, 0));

	while (!queue.empty()) {
		PSI pop = queue.front(); queue.pop();

		// 종료 조건
		if (pop.first == end) {
			cout << pop.second; break;
		}

		// Roll Dice
		for (short roll = 1; roll <= 6; roll++) {
			short cur_pos = pop.first + roll;
			if ((cur_pos <= end) && !visited[cur_pos]) {

				while ((game_Map[cur_pos] != 0) && !visited[cur_pos]) {
					cur_pos = game_Map[cur_pos];
					visited[cur_pos] = true;
				}

				queue.push(make_pair(cur_pos, pop.second + 1));
				visited[cur_pos] = true;
			}
		}
	}
}


int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	short N, M;	// 사다리의 수, 뱀의 수
	cin >> N >> M;

	short x, y;
	for (short i = 1; i <= M + N; i++) {
		cin >> x >> y;
		game_Map[x] = y;		// x칸에 도착 -> y칸으로 이동
	}

	BFS(1, 100);
}
