#include<iostream>
#include<queue>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    queue<int> q;
    for(int i = 1; i <= N; ++i){
        q.push(i);
    }
    
    while(q.size()!=1){
        q.pop();
        int cardPicked = q.front();
        q.pop();
        q.push(cardPicked);
    }
    cout << q.front();
    return 0;
}