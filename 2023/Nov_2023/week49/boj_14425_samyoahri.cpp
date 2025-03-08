#include<iostream>
#include<unordered_set>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    unordered_set<string> set;
    int N = 0, M = 0;
    cin >> N >> M;
    string input;
    for(int i = 0; i < N; ++i){
        cin >> input;
        set.insert(input);
    }
    int ans = 0;
    for(int i = 0; i < M; ++i){
        cin >> input;
        if(set.find(input)!=set.end())  ++ans;
    }
    cout << ans;
    return 0;
}