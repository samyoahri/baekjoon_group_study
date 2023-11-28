#include<iostream>
#include<deque>

using namespace std;
class Ballon{
    public:
        int idx;
        int numCard;
    public:
        Ballon(): idx(0), numCard(0){

        }
        Ballon(int _idx, int _numCard): idx(_idx), numCard(_numCard){

        }
        
};
void dequePrint(deque<Ballon> deque){
    cout << "============DEQUE============\n";
    for(int i = 0; i < deque.size(); ++i){
        Ballon ballon = deque.front();
        cout << ballon.idx << " " << ballon.numCard <<"\n";
        deque.pop_front();
        deque.push_back(ballon);
    }
    cout << "=============================\n";
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    deque<Ballon> deque;
    int numInput = 0;
    for(int i = 1; i <= N; ++i){
        cin >> numInput;
        Ballon ballon(i, numInput);
        deque.push_back(ballon);
    }


    int index = 0;
    while(true){
        Ballon nowBallon = deque.front();
        cout << nowBallon.idx << " ";
        int numCard = nowBallon.numCard;
        deque.pop_front();
        if(deque.empty())   break;
        if(numCard > 0){
            for(int i = 0; i < numCard - 1; ++i){
                deque.push_back(deque.front());
                deque.pop_front();
            }
        }
        else{
            for(int i = 0; i < abs(numCard); ++i){
                deque.push_front(deque.back());
                deque.pop_back();
            }
        }
    }
    return 0;
}