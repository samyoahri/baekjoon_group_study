#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;

vector<string> solve;
map<string, int> mp;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int n, m;
    cin >> n >> m;
    for(int i = 0; i < n + m; i++){
        string str; cin >> str;
        mp[str]++;
        if(mp[str] >= 2) solve.push_back(str);
    }
    sort(solve.begin(), solve.end());
    cout << solve.size() << '\n';
    for(auto ans : solve) cout << ans << '\n';
    return 0;
}

/*
// 브루트 포스로 풀면 시간초과
string str1[500001], str2[500001];
vector<string> solve;
int main(){
    int n, m;
    cin >> n >> m;

    for(int i = 0; i < n; i++) cin >> str1[i];
    for(int i = 0; i < m; i++){
        cin >> str2[i];
        for(int j = 0; j < n; j++){
            if(str1[j] == str2[i]){
                solve.push_back(str1[i]);
                break;
            }
        }
    }
    sort(solve.begin(),solve.end());
    cout << solve.size() << '\n';
    for(auto ans : solve){
        cout << ans << '\n';
    }
    return 0;
}
*/