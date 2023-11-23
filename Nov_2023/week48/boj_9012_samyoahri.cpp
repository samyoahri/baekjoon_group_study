#include<iostream>
#include<stack>
using namespace std;

int main(){
    int T = 0;
    cin >> T;
    while(T-- > 0){
        stack<char> stack;
        string str;
        cin >> str;
        for(int i = 0; i < str.length(); ++i){
            char ch = str[i];
            if(!stack.empty()){
                if(stack.top()=='(' && ch==')'){
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }
        if(stack.size()==0){
            cout << "YES\n";
        }
        else{
            cout << "NO\n";
        }
    }
    return 0;
}