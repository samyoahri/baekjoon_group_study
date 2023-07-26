#include<iostream>
#include<stack>
#include<string>

using namespace std;
int main(){
    int N;
    cin >> N;
    stack<int> stack;
    string input;
    
    for(int i = 0; i < N; i++){
        cin >> input;
        if(input == "push"){
            int X;
            cin >> X;
            stack.push(X);
        } else if(input == "pop"){
            if(!stack.empty()){
                cout << stack.top() << endl;
                stack.pop();
            } else{
                cout << "-1" << endl;
            }
        } else if(input == "size"){
            cout << stack.size() << endl;

        } else if(input == "empty"){
            if(stack.empty()){
                cout << "1" << endl;
            } else{
                cout << "0" << endl;
            }
        } else if(input == "top"){
            if(!stack.empty()){
                cout << stack.top() << endl;
            } else{
                cout << "-1" << endl;
            }
        }
    }
    return 0;
}