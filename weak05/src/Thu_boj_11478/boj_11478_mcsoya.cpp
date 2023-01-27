#include <iostream>
#include <map>
#include <cstring>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);

	char str[1001];
	cin >> str;

	int cnt = 0;    // 연속된 문자열의 개수
	int len = strlen(str);
	string tmp;
	map<string, int> maps;

	while (++cnt <= len) {
		for (int i = 0; i + cnt <= len; i++) {
			tmp = str; 
			tmp = tmp.substr(i, cnt);		// pos, count
			maps[tmp]++;
		}
	}
	printf("%d", maps.size());
}

/* 방법2
#include <iostream>
#include <set>
#include <cstring>

using namespace std;

int main() {
	char str[1001];
	scanf("%s", str);

	int cnt = 0;    // 연속된 문자열의 개수
	int len = strlen(str);
	string tmp;
	set<string> maps;

	while (++cnt <= len) {
		for (int i = 0; i + cnt <= len; i++) {
			tmp = str;
			maps.insert(tmp.substr(i, cnt));
		}
	}
	printf("%d", maps.size());
}
*/