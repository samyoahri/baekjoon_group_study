#include<iostream>
#include<queue>
#include<vector>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    priority_queue<int,vector<int>, greater<int>> cardsDequeASC;
    int cards = 0;
    for(int i = 0; i < N; ++i){
        cin >> cards;
        cardsDequeASC.push(cards);
    }
    int ans = 0, cnt = 0, tmp = 0;
    while(!cardsDequeASC.empty()){
        ++cnt;
        if(cnt%2==1){
            tmp += cardsDequeASC.top();
            cardsDequeASC.pop();
        }
        else{
            tmp += cardsDequeASC.top();
            cardsDequeASC.pop();
            cardsDequeASC.push(tmp);
            ans += tmp;
            tmp = 0;
        }
    }
    cout << ans;
    return 0;
}