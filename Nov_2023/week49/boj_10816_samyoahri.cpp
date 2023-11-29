#include<iostream>
#include<unordered_map>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0, M = 0;
    cin >> N ;
    unordered_map<int, int> cardDeq;
    int input = 0;
    for(int i = 0; i < N; ++i){
        cin >> input;
        if(cardDeq.find(input)==cardDeq.end()){
            cardDeq.insert(make_pair(input, 1));
        }
        else{
            ++cardDeq[input];
        }
    }
    cin >> M;
    for(int i = 0; i < M; ++i){
        cin >> input;
        if(cardDeq.find(input)==cardDeq.end()){
            cout << "0 " ;
        }
        else{
            cout << cardDeq[input] << " ";
        }
    }
    return 0;
}