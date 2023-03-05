#include <iostream>
#define ARR_MAX 101
#define INF 100000000

using namespace std;

long long int dist_arr[ARR_MAX][ARR_MAX];

void init(int n) {
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			dist_arr[i][j] = INF;
		}
		dist_arr[i][i] = 0;
	}
}

void Floyd(int n) {
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			for (int k = 1; k <= n; k++) {
				if (dist_arr[j][i] + dist_arr[i][k] < dist_arr[j][k]) {
					dist_arr[j][k] = dist_arr[j][i] + dist_arr[i][k];
				}
			}
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int n;				// 도시의 개수
	int m;				// 버스의 개수
	int a, b, c;		// 시작, 도착, 비용

	cin >> n;
	cin >> m;

	init(n);
	for (int i = 0; i < m; i++) {
		cin >> a >> b >> c;
		if(c < dist_arr[a][b]) dist_arr[a][b] = c;
	}

	Floyd(n);
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (dist_arr[i][j] == INF) cout << "0 ";
			else cout << dist_arr[i][j] << " ";
		}
		cout << '\n';
	}
}
