#include<iostream>
#include<stack>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    int command = -1;
    stack<int> stack;
    for(int i = 0; i < N; ++i){
        cin >> command;
        int num = 0;
        if(command==1) cin >> num;
        //push
        if(command==1){
            stack.push(num);
        }
        //pop
        else if(command==2){
            if(stack.empty()){
                cout << -1 << "\n";
                continue;
            }
            cout << stack.top() << "\n";
            stack.pop();
        }
        //size
        else if(command==3){
            cout << stack.size() << "\n";
        }
        //empty
        else if(command==4){
            if(stack.empty())   cout << 1 << "\n";
            else                cout << 0 << "\n";
        }
        //top
        else if(command==5){
            if(!stack.empty()) cout << stack.top() << "\n";
            else              cout << -1 << "\n";
        }
        else{
            cout << "Command Error\n";
            break;
        }
    }
    return 0;
}