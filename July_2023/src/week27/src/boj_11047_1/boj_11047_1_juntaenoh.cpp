//
//  main.cpp
//  boj_11047_1
//
//  Created by 노준태 on 2023/07/26.
//

#include <iostream>
#include <vector>
using namespace std;
vector<int> v;
int n,k,val,coin;

int main(){
    cin >> n >> k;
    for (int i = 0; i < n; i++){
        cin >> val;
        v.push_back(val);
    }
    coin = 0;
    while (!(k == 0) ){
        for (int i = n-1; i >= 0 ;i--){
            if (k >= v[i]){
                k -= v[i];
                coin += 1;
                break;
            }
        }
    }
    cout << coin;
    

}
