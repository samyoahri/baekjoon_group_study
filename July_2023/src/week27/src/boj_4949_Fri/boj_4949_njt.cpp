//
//  main.cpp
//  boj_4949
//
//  Created by 노준태 on 2023/07/29.
//  vps

#include <iostream>
#include <string>
#include <stack>

using namespace std;
string inputdata;
stack<char> charstack;

string checkvps (string inputdata){
    while( !charstack.empty() ) charstack.pop(); //stack 초기화
    for (int i = 0;i < inputdata.size(); i++){
        switch(inputdata[i]){ // 입력데이터 검사
            case '.':
                break;
            case '(':
                charstack.push('(');
                break;
            case '[':
                charstack.push('[');
                break;
            case ')':
                if(!charstack.empty() && charstack.top()=='(' ){
                    charstack.pop();
                }
                else
                    charstack.push(')');
                break;
            case ']':
                if(!charstack.empty() && charstack.top()=='[' ){
                    charstack.pop();
                }
                else
                    charstack.push(']');
                break;
            default:
                break;
                
        }
    }
    return charstack.empty() ? "yes" : "no";
}

int main() {
    
    while(true){
        getline(cin,inputdata);
        if (inputdata[0] == '.'){
            break;
        }
        cout << checkvps(inputdata) << endl;
    }
}
