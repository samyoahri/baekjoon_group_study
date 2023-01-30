#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, C, data;
	cin >> N >> C;

	unordered_map<int, int> maps;
	unordered_map<int, int> maps_idx;
	for (int i = 1; i <= N; i++) {
		cin >> data;
		maps[data]++;
		if(maps_idx[data] == 0) maps_idx[data] = i;
	}

	vector<pair<int, int>> copy_vector(maps.begin(), maps.end());
	// [=] : 스코프 내의 모든 변수 값을 복사 
	// [&] : 스코프 내의 모든 변수를 "참조"로 복사
	sort(copy_vector.begin(), copy_vector.end(), [&](pair<int, int>a, pair<int, int>b) {
		if (a.second > b.second) return 1;
		else if ((a.second == b.second) && (maps_idx[a.first] < maps_idx[b.first])) return 1;
		return 0;
	});

	for (auto const item : copy_vector) {
		for (int i = 1; i <= item.second; i++) cout << item.first << " ";
	}
}