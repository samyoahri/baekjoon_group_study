#include <iostream>
#include <queue>
#include <vector>
#include <cstdlib>
#define ARR_MAX 2001
#define MAX_INT 100000000

using namespace std;

int arr_s[ARR_MAX], arr_g[ARR_MAX], arr_h[ARR_MAX];

void init() {
	for (int i = 0; i < ARR_MAX; i++) {
		arr_s[i] = arr_g[i] = arr_h[i] = MAX_INT;
	}
}

void Das(int s, int dist_arr[], vector<pair<int, int>> adj[]) {
	dist_arr[s] = 0;
	priority_queue<pair<int, int>> queue;
	queue.push(make_pair(0, s));

	while (!queue.empty()) {
		int cur_cost = -queue.top().first;
		int cur_pos = queue.top().second;
		queue.pop();

		for (int i = 0; i < adj[cur_pos].size(); i++) {
			int calc = cur_cost + adj[cur_pos][i].second;
			int next_pos = adj[cur_pos][i].first;

			if (dist_arr[next_pos] > calc) {
				dist_arr[next_pos] = calc;
				queue.push(make_pair(-calc, next_pos));
			}
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int T;				// 테스트 케이스의 개수
	int n, m, t;		// 교차로, 도로, 목적지 후보의 개수
	int s, g, h;		// 예술가들의 출발지, g-h 사이를 지나갔다.
	int a, b, d;		// a-b, 가중치: d
	int x;				// 목적지 후보

	cin >> T;
	for (int i = 0; i < T; i++) {
		// 입력
		cin >> n >> m >> t;
		cin >> s >> g >> h;

		vector<pair<int, int>> adj[ARR_MAX];
		// 그래프 생성
		for (int j = 0; j < m; j++) {
			cin >> a >> b >> d;
			adj[a].push_back(make_pair(b, d));
			adj[b].push_back(make_pair(a, d));
		}

		init();
		Das(s, arr_s, adj);		// start
		Das(g, arr_g, adj);		// g
		Das(h, arr_h, adj);		// h

		priority_queue<int, vector<int>, greater<int>> answer;
		// 목적지 후보 입력
		for (int j = 0; j < t; j++) {
			cin >> x;
			if (arr_s[x] == (arr_s[g] + arr_g[h] + arr_h[x])) answer.push(x);
			else if (arr_s[x] == (arr_s[h] + arr_h[g] + arr_g[x])) answer.push(x);
		}

		while (!answer.empty()) {
			cout << answer.top() << " ";
			answer.pop();
		}
		cout << "\n";
	}


}
