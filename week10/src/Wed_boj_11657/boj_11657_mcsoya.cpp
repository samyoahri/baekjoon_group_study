#include <iostream>
#include <vector>
#define ARR_MAX 501
#define MAX_INT 999999999

using namespace std;

vector<pair<int, int>> adj[ARR_MAX];
long long int dist_arr[ARR_MAX];

void init(int N) {
	for (int i = 1; i <= N; i++) {
		dist_arr[i] = MAX_INT;
	}
}

int Bellmanford(int start, int N) {
	dist_arr[start] = 0;

	// N - 1번 실행 : 음수 사이클이 생기지 않는다. (재방문이 되기 떄문)
	for (int i = 1; i < N; i++) {
		for (int cur = 1; cur <= N; cur++) {
			for (int k = 0; k < adj[cur].size(); k++) {
				int next_pos = adj[cur][k].first;
				int next_cost = adj[cur][k].second;
				if (dist_arr[cur] != MAX_INT) {
					if (dist_arr[next_pos] > dist_arr[cur] + next_cost) {
						dist_arr[next_pos] = dist_arr[cur] + next_cost;
					}
				}
			}
		}
	}
	for (int cur = 1; cur <= N; cur++) {
		for (int k = 0; k < adj[cur].size(); k++) {
			int next_pos = adj[cur][k].first;
			int next_cost = adj[cur][k].second;
			if (dist_arr[cur] != MAX_INT) {
				if (dist_arr[next_pos] > dist_arr[cur] + next_cost) {
					return -1;
				}
			}
		}
	}

	return 1;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);
	
	int N, M;		// 도시의 개수, 버스 노선의 개수
	int A, B, C;	// start, end, weight

	cin >> N >> M;
	init(N);

	for (int i = 1; i <= M; i++) {
		cin >> A >> B >> C;
		adj[A].push_back(make_pair(B, C));
	}

	short result = Bellmanford(1, N);
	if (result == -1) cout << result;
	else {
		for (int i = 2; i <= N; i++) {
			if (dist_arr[i] == MAX_INT) cout << "-1\n";
			else cout << dist_arr[i] << "\n";
		}
	}
}
