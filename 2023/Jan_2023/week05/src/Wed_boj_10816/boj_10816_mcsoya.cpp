#include <iostream>
#include <map>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M, data;
	cin >> N;

	map<int, int> map;

	for (int i = 1; i <= N; i++) {
		cin >> data;
		map[data] += 1;
	}

	cin >> M;
	for (int j = 1; j <= M; j++) {
		cin >> data;
		cout << map[data] << " ";
	}
}