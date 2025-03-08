#include<iostream>
#include<queue>
#include<string>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0, K = 0;
    cin >> N >> K;
    queue<int> q;
    for(int i = 1; i <= N; ++i){
        q.push(i);
    }
    vector<string> ans;
    ans.push_back("<");
    while(!q.empty()){
        for(int i = 1; i < K; ++i){
            int pickedPerson = q.front();
            q.pop();
            q.push(pickedPerson);
        }
        if(q.size() != 1){
            ans.push_back(to_string(q.front()) + ", " );
        }
        else{
            ans.push_back(to_string(q.front()));
        }
        q.pop();
    }
    ans.push_back(">");
    for(int i = 0; i < ans.size(); ++i){
        cout << ans.at(i);
    }
    return 0;
}