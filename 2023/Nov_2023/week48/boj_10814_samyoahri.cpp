#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
bool cmp(const pair<int, string>& a, const pair<int, string>& b){
    // if(a.first==b.first)    return a.second < b.second;
    // else                    return a.first < b.first;
    return a.first < b.first;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    vector<pair<int, string>> arr;
    int age = 0; string name;
    for(int i = 0; i < N; ++i){
        cin >> age >> name;
        arr.push_back(make_pair(age, name));
    }
    sort(arr.begin(), arr.end(), cmp);
    for(const pair<int, string>& tmp : arr){
        cout << tmp.first << " " << tmp.second << "\n";
    }
    return 0;
}