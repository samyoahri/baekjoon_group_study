#include<iostream>
#include<vector>
#include<algorithm>
#include<map>
#include<unordered_map>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    vector<int> arr1;
    vector<int> arr2;
    int min = 2147000000;
    int N = 0, num = 0;
    cin >> N;
    for(int i = 0; i < N; ++i){
        cin >> num;
        arr1.push_back(num);
        arr2.push_back(num);
    }
    sort(arr2.begin(), arr2.end());
    // map<int, int> map;
    unordered_map<int, int> map;
    int cnt = 0;
    for(const int& integer : arr2){
        if(map.find(integer)==map.end()){
            map.insert(make_pair(integer, cnt++));
        }
    }
    for(const int& integer: arr1){
        cout << map[integer] << " ";
    }

    
    return 0;
}