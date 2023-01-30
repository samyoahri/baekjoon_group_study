#include <iostream>
#include <map>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M;
	cin >> N >> M;

	char url[21], password[21];
	map<string, string> maps;

	for (int i = 1; i <= N; i++) {
		cin >> url >> password;
		maps[url] = password;
	}

	char str[21];
	for (int j = 1; j <= M; j++) {
		cin >> str;
		if (maps.find(str) != maps.end()) {
			cout << maps[str].c_str() << "\n";
		}
	}
}