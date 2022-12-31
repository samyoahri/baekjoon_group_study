#include <bits/stdc++.h>
using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	while (1) {
		stack<char> s;
		string str; bool jud = true;
		getline(cin,str);
		if (str[0] == '.') {
			break;
		}
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str[i] == '(' || str[i] == '[') {
				s.push(str[i]);
			}
			else if (str[i] == ')') {
				if (s.empty() || s.top() != '(') {
					jud = false; break;
				}
				s.pop();
			}
			else if (str[i] == ']') {
				if (s.empty() || s.top() != '[') {;
					jud = false; break;
				}
				s.pop();
			}
		}
		if (!s.empty()) jud = false;
		if (jud == true) {
			cout << "yes" << '\n';
		}
		else {
			cout << "no" << '\n';
		}
	}
	return 0;
}