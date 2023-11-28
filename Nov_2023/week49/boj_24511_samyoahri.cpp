#include<iostream>
#include<deque>

using namespace std;
enum ADT{
    queueStructure, stackStructure
};
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    bool *ADTflag = new bool[N];
    for(int i = 0; i < N; ++i){
        cin >> ADTflag[i];
    }
    int *initData = new int[N];
    for(int i = 0; i < N; ++i){
        cin >> initData[i];
    }
    deque<int> dq;
    for(int i = 0; i < N; ++i){
        if(ADTflag[i]==stackStructure)  continue;
        dq.push_front(initData[i]);
    }
    delete[] ADTflag;
    delete[] initData;
    // while(!dq.empty()){
    //     cout << dq.front() << "\n";
    //     dq.pop_front();
    // }
    int M = 0;
    cin >> M;
    int num;
    for(int i = 0; i < M; ++i){
        cin >> num;
        dq.push_back(num);
        cout << dq.front() << " ";
        dq.pop_front();
    }


    return 0;
}