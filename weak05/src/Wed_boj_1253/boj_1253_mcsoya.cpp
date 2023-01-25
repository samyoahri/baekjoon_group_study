#include <iostream>
#include <map>
#include <functional>

using namespace std;

// ※ Dictonary를 사용하지 않고 푸는 코드가 더 효율적이다(다른 코드 참고)

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, data;
	cin >> N;

	map<int, int, less<int>> map_test;
	map<int, bool, less<int>> map_valid;

	// 1. Input
	for (int i = 1; i <= N; i++) {
		cin >> data;

		map_test[data]++;
		map_valid[data] = true;
	}

	// 2. Valid
	int result = 0;
	for (auto const item : map_valid) {
		int key = item.first;
		for (auto const inner_item : map_valid) {
			int a = inner_item.first;
			int b = key - a;
			if (a <= b) {
				if (a + b == key) {
					if ((a == b) && (map_test[a] > 1)) {
						if ((a == key) && map_test[a] > 2) {
							result += map_test[key];
							break;
						}
						else if ((a != key)) {
							result += map_test[key];
							break;
						}
					}
					else if ((a != b) && (map_test[a] > 0) && (map_test[b] > 0)) {
						if (((a == key) || (b == key)) && (map_test[key] > 1)) {
							result += map_test[key];
							break;
						}
						else if ((a != key) && (b != key)) {
							result += map_test[key];
							break;
						}
					}
				}
				else break;
			}
			else break;
		}
	}

	// 3. Result 
	cout << result;
}