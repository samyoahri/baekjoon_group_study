#include <iostream>
#include <string.h>
#include <stack>
using namespace std;

int main() {
	int N;
	cin >> N;
	stack<char> st;
	char s[51];
	for (int i = 0; i < N; i++) {
		cin >> s;
		cin.ignore();
		while (!st.empty())
			st.pop();
		for (int j = 0; j < strlen(s); j++) {
			if (s[j] == '(') {
				st.push(s[j]);
			}
			else if (s[j] == ')') {
				if (st.empty() || st.top() == ')')
					st.push(s[j]);
				else
					st.pop();
			}
		}
		if (st.empty()) {
			cout << "YES" << endl;
		}
		else if (!st.empty()) {
			cout << "NO" << endl;
		}

	}
	return 0;
}