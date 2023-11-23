#include<iostream>
#include<stack>
#include<vector>
#include<algorithm>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    int num = 0;
    int order = 1;
    vector<int> students(N);
    stack<int> waitingList;
    for(int i = 0; i < N; ++i){
        cin >> num;
        students[i] = num;
    }
    for(const int& student : students){
        // cout << "student:" <<student << " " << "order:" << order <<"\n";
        // if(!waitingList.empty()){
        //     if(waitingList.top()==order){
        //         ++order;
        //         waitingList.pop();
        //     }
        // }
        while(!waitingList.empty() && waitingList.top()==order){
            ++order;
            waitingList.pop();
        }
        if(student==order){
            ++order;
        }
        else{
            waitingList.push(student);
        }
    }
    while(!waitingList.empty() && (waitingList.top() == order)){
        waitingList.pop();
        ++order;

    }
    if(waitingList.size()==0)   cout <<"Nice\n";
    else                        cout <<"Sad\n";
    cout << "waitingList:";
    // while(!waitingList.empty()){
    //     cout << waitingList.top();
    //     waitingList.pop();
    // }
    // cout << "order:" << order;
    return 0;
}