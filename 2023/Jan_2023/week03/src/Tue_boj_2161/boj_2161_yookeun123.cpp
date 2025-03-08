#include <iostream>
#include <stdio.h>
#include <string.h>
#include <deque>

using namespace std;
//

int main() {
	cin.tie(NULL);
	cin.sync_with_stdio(false);
	cout.sync_with_stdio(false);
	int N;
	cin >> N;
	deque<int> qu;
	for (int i = 0; i < N; i++) {
		qu.push_front(i+1);
	}
	while (!(qu.size() == 1)) {
		cout << qu.back() << ' ';
		qu.pop_back();
		qu.push_front(qu.back());
		qu.pop_back();
	}
	cout << qu.back();
	return 0;
}
        
