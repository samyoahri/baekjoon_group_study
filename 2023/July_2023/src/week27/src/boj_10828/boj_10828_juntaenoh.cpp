//
//  main.cpp
//  test
//
//  Created by 노준태 on 2023/07/11.
//. stack

#include <iostream>
#include <stack>
#include<queue>
#include <map>

using namespace std;

map<string,int> m;
stack<int> st;
queue<int>q;
int n  ;
int inputdata;
string Command;


int main() {
    m.insert({"push",0});
    m.insert({"pop",1});
    m.insert({"size",2});
    m.insert({"empty",3});
    m.insert({"top",4});
    cin >> n;
    for(int i = 0; i < n ; i++){
        cin >> Command;
        
        switch(m[Command]){
            
            case 0:
                cin >> inputdata;
                st.push(inputdata);
                break;
            
            case 1:
                if (st.empty()){
                    q.push(-1);
                }
                else{
                    q.push(st.top());
                    st.pop();
                }
                break;
            case 2:
                q.push(st.size());
                break;
            case 3:
                q.push(st.empty());
                break;
            case 4:
                if (st.empty()){
                    q.push(-1);
                }
                else{
                    q.push(st.top());
                }
 
                break;
    
        }
    }
    while (!q.empty()) {
            cout << q.front() <<endl;
            q.pop();
        }

    return 0;
}
