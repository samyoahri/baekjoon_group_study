#include <bits/stdc++.h>
using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		stack<char> s;
		string str;
		bool jud = true;
		cin >> str;
		for (auto i : str) {
			if (i == '(') s.push(i);
			else if (i == ')') {
				if (s.empty() || s.top() != '(') {
					jud = false;
					break;
				}
				s.pop();
			}
		}
		if (!s.empty()) jud = false;
		if (jud == true) cout << "YES" << '\n';
		else cout << "NO" << '\n';
	}
	return 0;
}