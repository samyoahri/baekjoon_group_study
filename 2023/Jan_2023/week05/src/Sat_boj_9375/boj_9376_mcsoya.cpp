#include <iostream>
#include <map>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int T, N;
	int cnt = 1;
	cin >> T;		// Input 1

	char A[21], B[21];    // name, type
	map<string, int> maps;

	for (int i = 1; i <= T; i++, maps.clear()) {
		cin >> N;	// Input 2

		for (int j = 1; j <= N; j++) {
			cin >> A >> B; maps[B]++;		// Input 3
		}

		int tmp = 1;
		for (auto const item : maps) tmp *= (item.second + 1);
		
		cout << ((tmp == 1) ? 0 : tmp - 1) << "\n";     // n == 0, check
	}
}