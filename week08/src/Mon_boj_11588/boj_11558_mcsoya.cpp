#include <iostream>
#include <vector>
#define ARR_MAX 10001

using namespace std;

short adj[ARR_MAX];
int cnt = 0;

void DFS(int start, int N, bool visited[]) {
	int target = adj[start];
	visited[start] = true;
	
	cnt++;

	if (target == N) cout << cnt << "\n";
	else {
		if (!visited[target]) DFS(target, N, visited);
		else cout << "0\n";
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int T;		// 테스트 케이스의 개수
	short N;	// 플레이어의 숫자 ( N <= 10000 )
	short select;		// 지명한 사람의 숫자

	cin >> T;
	for (int c = 1; c <= T; c++) {
		cin >> N;

		for (short i = 1; i <= N; i++) {
			cin >> select;
			adj[i] = select;
		}

		bool visited[ARR_MAX] = { false };
		cnt = 0;
		DFS(1, N, visited);	
	}
}
