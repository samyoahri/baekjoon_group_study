#include<iostream>
#include<deque>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    deque<int> deq;
    while(N-- > 0){
        int command = 0;
        cin >> command;
        int num = -1;
        if(command==1 || command == 2)  cin >> num;
        if(command==1){
            deq.push_front(num);
        }
        else if(command==2){
            deq.push_back(num);
        }
        else if(command==3){
            if(!deq.empty()){
                cout << deq.front() << "\n";
                deq.pop_front();
            }
            else{
                cout << -1 << "\n";
            }
        }
        else if(command==4){
            if(!deq.empty()){
                cout << deq.back() << "\n";
                deq.pop_back();
            }
            else{
                cout << -1 << "\n";
            }
        }
        else if(command==5){
            cout << deq.size() << "\n";
        }
        else if(command==6){
            if(!deq.empty()){
                cout << 0 << "\n";
            }
            else{
                cout << 1 << "\n";
            }
        }
        else if(command==7){
            if(!deq.empty()){
                cout << deq.front() << "\n";
            }
            else{
                cout << -1 << "\n";
            }
        }
        else if(command==8){
            if(!deq.empty()){
                cout << deq.back() << "\n";
            }
            else{
                cout << -1 << "\n";
            }
        }
        else{
            cout << "Error" << "\n";
        }
    }
    return 0;
}