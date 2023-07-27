//
//  main.cpp
//  boj_9012
//
//  Created by 노준태 on 2023/07/27.
//  괄호

#include <iostream>
#include <stack>
#include <string>
using namespace std;
int n;
string inputdata;
stack<char> vps;

/* vps 체크 함수 */
void checkvps (string inputdata){
    while( !vps.empty() ) vps.pop();// vps stack 초기화
    for (int i = 0; i < inputdata.size();i++){
        //stack 이 비어있지 않고,stack.top이 ( 이고  입력값이 ) 일때
        if ((!vps.empty())&& (vps.top()=='(')&& (inputdata[i] == ')') ){
            // ( 제거하고 ) 안넣고
            vps.pop();
        }
        // 아무것도 아니면
        else
            // stack.push
            vps.push(inputdata[i]);
    }
    vps.empty()? cout<< "YES"<<endl  : cout<< "NO"<< endl;
}

int main() {
    cin >> n;
    for (int i = 0; i < n;i++){
        cin >> inputdata ;
        checkvps(inputdata);
        
    }
    

}
