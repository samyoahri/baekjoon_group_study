#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
bool desc(int a, int b){
    return a > b;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    string str;
    cin >> str;
    vector<int> arr(str.length());
    for(int i = 0; i < str.length(); ++i){
        arr[i] = (int)str[i] - 48;
    }
    sort(arr.begin(), arr.end(), desc);
    for(int i = 0; i < arr.size(); ++i){
        cout << arr[i];
    }
}