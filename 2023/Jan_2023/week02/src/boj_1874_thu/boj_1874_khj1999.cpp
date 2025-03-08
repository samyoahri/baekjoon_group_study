#include <bits/stdc++.h>
using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	stack<int> s; vector<char> v;
	int n, j = 0;
	cin >> n;
	int arr[100001];
	for (int i = 0; i < n; i++) cin >> arr[i];
	for (int i = 1; i <= n; i++) {
		s.push(i);
		v.push_back('+');
		while (!s.empty() && s.top() == arr[j]) {
			s.pop();
			v.push_back('-');
			j++;
		}
	}
	if (!s.empty()) cout << "NO";
	else {
		for (auto i : v) cout << i << '\n';
	}
	return 0;
}