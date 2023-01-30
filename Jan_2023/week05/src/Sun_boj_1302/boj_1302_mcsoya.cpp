#include <iostream>
#include <map>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N;
	cin >> N;

	char book_name[51];
	map<string, int, less<string>> maps;

	for (int i = 1; i <= N; i++) {
		cin >> book_name;
		maps[book_name]++;
	}

	string top_book = " ";
	for (auto const item : maps) {
		if (item.second > maps[top_book]) top_book = item.first;
	}
	cout << top_book.c_str();
}