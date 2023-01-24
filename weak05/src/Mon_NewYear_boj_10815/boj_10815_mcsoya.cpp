#include <iostream>
#include <unordered_map>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M, data;
	cin >> N;

	unordered_map<int, int> maps;

	for (int i = 1; i <= N; i++) {
		cin >> data;
		maps.insert(make_pair(data, 1));
	}

	cin >> M;
	for (int i = 1; i <= M; i++) {
		cin >> data;
		cout << ((maps.find(data) != maps.end()) ? "1" : "0") << " ";
	}
}