#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
bool cmp(pair<int, int> a, pair<int, int> b){
    if(a.second != b.second){
        return a.second < b.second;
    }
    return a.first < b.first;
}
int main(){
    int N = 0;
    cin >> N;
    vector<pair<int, int>> arr;
    int x, y;
    for(int i = 0; i < N; ++i){
        cin >> x >> y;
        arr.push_back(make_pair(x, y));
    }
    sort(arr.begin(), arr.end(), cmp);
    for(int i = 0; i < arr.size(); ++i){
        cout << arr[i].first << " " << arr[i].second << "\n";
    }
    return 0;
}