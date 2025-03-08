//
//  main.cpp
//  boj_10773_1
//
//  Created by 노준태 on 2023/07/26.
//

#include <iostream>
#include <stack>
using namespace std;


int k,num,sum;
stack<int> s;

int main(){
    sum = 0;
    cin >> k;
    for ( int i = 0; i <k; i++){
        
        cin >> num;
        if (num==0){
            if (s.empty()){
                continue;
            }
            else
                s.pop();
        }
        else{
            s.push(num);
        }
    }
    while(!s.empty()){
        sum += s.top();
        s.pop();
    }
    cout << sum;
    
}
