#include <iostream>
#include <map>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cin.tie(NULL);

	int N, M;
	cin >> N >> M;

	char name[21];
	map<string, int> maps;		// key값의 변수 형식을 char*로 설정 시, 오류 발생
	map<int, string> maps_int;		// key값의 변수 형식을 char*로 설정 시, 오류 발생
	for (int i = 1; i <= N; i++) {
		cin >> name;
		maps[name] = i;
		maps_int[i] = name;
	}

	for (int j = 1; j <= M; j++) {
		cin >> name;
		if (atoi(name) == 0) cout << maps[name];
		else cout << maps_int[atoi(name)].c_str();
		cout << "\n";
	}
}