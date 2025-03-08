#include<iostream>
#include<stack>

using namespace std;

int main(){
    int N = 0;
    cin >> N;
    int num = -1;
    stack<int> stack;
    for(int i = 0; i < N; ++i){
        cin >> num;
        if(num==0 && !stack.empty())    stack.pop();
        else                            stack.push(num);
    }
    int sum = 0;
    while(!stack.empty()){
        sum += stack.top();
        stack.pop();
    }
    cout << sum << "\n";
    return 0;
}