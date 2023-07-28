//
//  main.cpp
//  boj_1931
//
//  Created by 노준태 on 2023/07/26.
//  meeting



#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;



bool cmp (pair<int, int> a, pair<int, int> b){
    
    if (a.second == b.second){// 종료시간이 같으면
        return a.first < b.first; // 시작시간이 빠른순
    }
    else return  a.second < b.second; //종료시간 stack
}
int main() {
    vector<pair<int, int>> meetings;
    int n,starttime,endtime,countmeet,maxmeet;
    maxmeet = 0;
    
    cin >> n;
    for (int i = 0; i < n ; i++){
        cin >> starttime >> endtime;
        meetings.push_back(pair(starttime, endtime));
    }
    
    sort(meetings.begin(),meetings.end(),cmp); // 종료시간 오름차순 sort

    endtime = 0;
        for (int j = 0; j < n ; j++){
            if (meetings[j].first >= endtime){
                endtime = meetings[j].second;
                maxmeet++;
            }
        }

    cout << maxmeet;
    return 0;
}
