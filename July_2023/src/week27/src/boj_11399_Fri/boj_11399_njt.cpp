//
//  main.cpp
//  boj_11399
//
//  Created by 노준태 on 2023/07/29.
//  ATM

#include <iostream>
#include <vector>
using namespace std;

vector<int> atm_time;



int main() {
    int n,inputdata,sol;
    cin >> n;
    for (int i = 0; i < n;i++){
        cin >> inputdata;
        atm_time.push_back(inputdata);
    }
    sort(atm_time.rbegin(),atm_time.rend());
    sol = 0;
    for (int i = 0; i < n;i++){
        sol += (atm_time[i] * (i+1));
    }
    cout << sol;
}
