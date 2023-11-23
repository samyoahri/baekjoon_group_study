#include<iostream>
#include<stack>
#include<string>
using namespace std;

int main(){
    
    while(true){
        // cin >> str;
        string str;
        getline(cin, str);
        if(str==".")    break;
        stack<char> stack;
        for(int i = 0; i < str.length(); ++i){
            char ch = str[i];
            if(ch != '(' && ch != ')' && ch != '[' && ch != ']'){
                continue;
            }
            if(!stack.empty()){
                if(stack.top()=='(' && ch==')'){
                    stack.pop();
                }
                else if(stack.top()=='[' && ch==']'){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
            
        }
        if(stack.size()==0) cout << "yes\n";
        else                cout << "no\n";
    }
}