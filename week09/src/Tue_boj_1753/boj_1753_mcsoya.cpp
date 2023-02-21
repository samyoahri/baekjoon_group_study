#include <iostream>
#include <vector>
#include <queue>
#define ARR_MAX 20001
#define W_MAX 300000

using namespace std;

typedef struct item {
	int next;
	int weight;

	item(int uend, int uweight) : next(uend), weight(uweight) {}
}Item;

vector<Item> adj[ARR_MAX];
int dist_arr[ARR_MAX];

struct cmp {
    // 바뀌는 경우, true를 반환
	bool operator()(const pair<int ,int> &a, const pair<int, int> &b) {
		if (a.second > b.second) return true;
		else return false;
	}
};

void Dsa(int start) {
	priority_queue <pair<int, int>, vector<pair<int, int>>, cmp> pq;
	pq.push(make_pair(start, 0));
	dist_arr[start] = 0;

	while (!pq.empty()) {
		int cur_pos = pq.top().first;
		int cur_cost = pq.top().second;
		pq.pop();

		for (int i = 0; i < adj[cur_pos].size(); i++) {
			int next_pos = adj[cur_pos][i].next;
			int next_cost = adj[cur_pos][i].weight;

			if (dist_arr[next_pos] > cur_cost + next_cost) {
				dist_arr[next_pos] = cur_cost + next_cost;
				pq.push(make_pair(next_pos, dist_arr[next_pos]));
			}
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int V, E;		// 정점 개수, 간선 개수
	cin >> V >> E;

	int K;			// 시작 정점의 번호
	cin >> K;

	int u, v, w;		// start, end, weight
	for (int i = 1; i <= E; i++) {
		cin >> u >> v >> w;
		adj[u].push_back(Item(v, w));
	}

	for (int i = 1; i <= V; i++) {
		dist_arr[i] = W_MAX;
	}

	Dsa(K);
	for (int i = 1; i <= V; i++) {
		if (dist_arr[i] == W_MAX) cout << "INF";
		else cout << dist_arr[i];

		cout << "\n";
	}
}
