#include <iostream>
#include <vector>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, K;			// 사람의 수, 보성의 번호
	cin >> N >> K;

	vector<int> adj(N, -1);
	vector<bool> visit(N, false);
	
	for (int i = 0; i < N; i++) cin >> adj[i];
	
	int M = 0;
	for (int pos = 0; !visit[pos]; pos = adj[pos]) {
		visit[pos] = 1;
		M++;

		if (adj[pos] == K) {
			cout << M;
			return 0;
		}
	}
	cout << -1;
}
