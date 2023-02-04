#include <iostream>
#include <algorithm>
#include <string>
#include <queue>
#include <unordered_map>

using namespace std;

int check(string result, string answer) {
	return (result == answer);
}

int BFS(string str, int N, int K) {

	// 1) 필요한 변수 선언
	string sorted_str = str;
	unordered_map<string, bool> visited;
	queue<pair<string, int>> queue;
	
	// 2) 필요한 메소드 실행
	sort(sorted_str.begin(), sorted_str.end());
	queue.push(make_pair(str, 0));
	visited[str.c_str()] = true;

	// 3) 결과 분석
	if (check(str, sorted_str)) return 0;
	while (!queue.empty()) {
		pair<string, int> pop = queue.front();
		queue.pop();

		if (check(pop.first, sorted_str)) return pop.second;

		for (int i = 0; i < N - K + 1; i++) {
			string reverse_str = pop.first;
			reverse(reverse_str.begin() + i, reverse_str.begin() + i + K);

			if (!visited[reverse_str]) {
				visited[reverse_str] = true;
				queue.push(make_pair(reverse_str, pop.second + 1));
			}
		}
	}
	
	return -1;
}

// --------------------------------------------------------------------------------

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, K, data;
	cin >> N >> K;

	string str;
	for (int i = 1; i <= N; i++) {
		cin >> data; 
		str.append(to_string(data));
	}

	int res = BFS(str, N, K);
	cout << ((res < 0) ? -1 : res);
}
