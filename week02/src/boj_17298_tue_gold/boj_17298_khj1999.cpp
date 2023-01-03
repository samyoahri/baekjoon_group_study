#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
    int n;
    cin >> n;
    vector<int> v(n), solve(n);
    stack<int> s;
    for(int i = 0; i < n; i++){
        cin >> v[i]; solve[i] = -1;
        while(!s.empty() && v[s.top()] < v[i]){
            solve[s.top()] = v[i];
            s.pop();
        }
        s.push(i);
    }
    for(auto ans : solve) cout << ans << ' ';
    return 0;
}

// 예제 입력 1
// stack : {3} -> {5} -> {5, 2} -> {7}
// top : 0 -> 1 -> 2 -> 1 -> 3(end)
// pop : 0 -> 2 -> 1 -> end
// solve : {-1, -1, -1, -1} -> {5, -1, -1, -1} -> {5, -1, 7, -1} -> {5, 7, 7, -1}
// 사실 solve 배열은 -1로 초기화 되어있지 않음