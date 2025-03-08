#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdlib>
#define ARR_MAX 26

using namespace std;

bool** visited;
int cnt = 0;

void DFS(int i, int j, int N) {
	visited[i][j] = 0;
	cnt++;
	
	for (int k = 1; k <= N; k++) {
		if ((i > 1) && (visited[i - 1][j] == 1)) DFS(i - 1, j, N);
		if ((i < N) && (visited[i + 1][j] == 1)) DFS(i + 1, j, N);

		if ((j > 1) && (visited[i][j - 1] == 1)) DFS(i, j - 1, N);
		if ((j < N) && (visited[i][j + 1] == 1)) DFS(i, j + 1, N);
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N;		// 단지 수
	cin >> N;
    
    visited = (bool**)calloc(N + 1, sizeof(bool*));
    for(int i = 1; i <= N; i++) visited[i] = (bool*)calloc(N + 1, sizeof(bool));

	char str[26];
	for (int i = 1; i <= N; i++) {
		cin >> str;
		for (int j = 0; j < N; j++) {
			visited[i][j + 1] = str[j] - '0';
		}
	}

	vector<int> result;
	for (int i = 1; i <= N; i++) {
		for (int j = 1; j <= N; j++) {
			if (visited[i][j] == 1) {
				DFS(i, j, N);
				result.push_back(cnt);
				cnt = 0;
			}
		}
	}
	
	sort(result.begin(), result.end());
	cout << result.size() << "\n";
	for (int i = 0; i < result.size(); i++) {
		cout << result[i] << "\n";
	}
    
    free(visited);
}
