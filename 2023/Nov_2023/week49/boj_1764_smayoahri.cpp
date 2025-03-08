#include<iostream>
#include<unordered_set>
#include<algorithm>
#include<vector>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0, M = 0;
    cin >> N >> M;
    unordered_set<string> notHearedSet;
    unordered_set<string> notSeenSet;
    string input;
    for(int i = 0 ; i < N; ++i){
        cin >> input;
        notHearedSet.insert(input);
    }
    for(int i = 0; i < M; ++i){
        cin >> input;
        notSeenSet.insert(input);
    }
    vector<string> ans;
    for(const string& notHearedPerson : notHearedSet){
        if(notSeenSet.find(notHearedPerson)!=notSeenSet.end()){
            ans.push_back(notHearedPerson);
        }
    }
    sort(ans.begin(), ans.end());
    cout << ans.size() << "\n";
    for(const string& notHearedAndSeenPerson : ans){
        cout << notHearedAndSeenPerson << "\n";
    }
    return 0;
}