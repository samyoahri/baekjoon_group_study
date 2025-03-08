#include<iostream>
#include<unordered_set>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    int N = 0;
    cin >> N;
    unordered_set<int> cardOfSangun;
    int card = 0;
    for(int i = 0; i < N; ++i){
        cin >> card;
        cardOfSangun.insert(card);
    }
    int M = 0;
    cin >> M;
    for(int i = 0; i < M; ++i){
        cin >> card;
        if(cardOfSangun.find(card)!=cardOfSangun.end()){
            cout << "1 ";
        }
        else{
            cout << "0 ";
        }
    }

    return 0;
}