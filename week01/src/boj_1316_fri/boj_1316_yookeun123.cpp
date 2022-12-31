#include <iostream>
#include <string>
using namespace std;

int main() {
	int N;
	cin >> N;
	string word;
	int count = 0;
	for (int i = 0; i < N; i++) {
		cin >> word;
		bool check = true;
		for (int j = 0; j < word.length(); j++) {
			for (int k = 0; k < j; k++)
				if (word[j] != word[j - 1] && word[j] == word[k]) {
					check = false;
					break;
				}
		}
		if(check) count++;
	}
	cout << count;
}