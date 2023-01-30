#include <iostream>
#include <queue>
#include <string.h>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N;
	cin >> N;

	deque<int> queue;
	char str[15];
	int data;

	for (int i = 1; i <= N; i++) {
		cin >> str;
		if (strcmp(str, "push_back") == 0) {
			cin >> data;
			queue.push_back(data);
		} 
		else if (strcmp(str, "push_front") == 0) {
			cin >> data;
			queue.push_front(data);
		} 
		else if (strcmp(str, "pop_back") == 0) {
			if (queue.empty()) cout << "-1" << endl;
			else {
				int pop = queue.back();
				queue.pop_back();
				cout << pop << endl;
			}
		} 
		else if (strcmp(str, "pop_front") == 0) {
			if (queue.empty()) cout << "-1" << endl;
			else {
				int pop = queue.front();
				queue.pop_front();
				cout << pop << endl;
			}
		} 
		else if (strcmp(str, "size") == 0) {
			cout << queue.size() << endl;
		} 
		else if (strcmp(str, "empty") == 0) {
			cout << queue.empty() << endl;
		} 
		else if (strcmp(str, "front") == 0) {
			if (queue.empty()) cout << "-1" << endl;
			else cout << queue.front() << endl;
		} 
		else if (strcmp(str, "back") == 0) {
			if (queue.empty()) cout << "-1" << endl;
			else cout << queue.back() << endl;
		}
	}
	
}