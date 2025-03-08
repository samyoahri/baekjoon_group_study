#include <stack>
#include <iostream>
#include <string>
 
using namespace std;

int main(){

    int input = 0;
    cin >> input;
    
    for(int i = 0; i < input; i++){
        stack<char> stack;
        string s;
        cin >> s; 

        for(int j = 0; j < s.length(); j++){
            if(stack.empty() || s[j] == '('){  
                stack.push(s[j]);
            } else if(stack.top() == '('){
                stack.pop();
            }
        }
        if(stack.empty()){
            cout << "YES" << endl;
        }else{
            cout<< "NO" << endl;
        }

    }

    return 0;
}
