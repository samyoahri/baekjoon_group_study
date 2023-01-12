#include <iostream>
#include <stack>
using namespace std;

int main(){
    stack<int> stack,stack1;
    int n,a;
    cin >> n;
    for (int i = 0;i<n;i++){
        cin >> a;
        stack.push(a);
    }
    stack1.push(stack.top());
    while(!stack.empty()){
        if (stack1.top() < stack.top()){
            stack1.push(stack.top());
        }
        stack.pop();
    }
    cout<< stack1.size();


}