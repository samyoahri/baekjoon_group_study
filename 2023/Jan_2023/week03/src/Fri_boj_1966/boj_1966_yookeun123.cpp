#include <iostream>
#include <stdio.h>
#include <string.h>
#include <queue>
#include <deque>
#include <algorithm>
//
using namespace std;

bool cmp(int a, int b) {
    return a > b;
}
int que() {
    int n, k, cnt = 0;
    queue<int>q;
    deque<int>dq;
    cin >> n >> k;
    for (int i = 0; i < n; i++) {
        int t;
        cin >> t;
        q.push(t); dq.push_back(t);
    }
    sort(dq.begin(), dq.end(), cmp);
    while (!q.empty()) {
        while (q.front() != dq[0]) {
            q.push(q.front());
            q.pop();
            k--;
            if (k == -1) k += q.size();
        }
        q.pop(); dq.pop_front();
        cnt++;
        if (k == 0) break;
        k--;
    }
    return cnt;
}
int main() {
	cin.tie(NULL);
	cin.sync_with_stdio(false);
	cout.sync_with_stdio(false);
    int N;
    cin >> N;
    while (N != 0) {
        N--;
        cout << que() << '\n';
    }
}
        
