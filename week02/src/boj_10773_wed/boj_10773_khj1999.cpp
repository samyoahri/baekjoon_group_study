#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int k, ans = 0;
    cin >> k;
    vector<int> v(k);
	for (int i = 0; i < k; i++) {
        cin >> v[i];
        if (v[i] == 0) {
            for (int j = i; true; j--) {
                if (v[j] != 0) { v[j] = 0; break; }
			}
		}
	}
    for(auto i : v) ans += i;
    cout << ans;
    return 0;
}