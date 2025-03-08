#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_set>
using namespace std;
bool cmp(string str1, string str2){
    if(str1.length()==str2.length()){
        return (str1 < str2);
    }
    return (str1.length() < str2.length());
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    vector<string> arr;
    unordered_set<string> uniqueString;
    string str;

    for(int i = 0; i < N; ++i){
        cin >> str;
        if(uniqueString.find(str)==uniqueString.end()){
            arr.push_back(str);
            uniqueString.insert(str);
        }
    }
    sort(arr.begin(), arr.end(), cmp);
    for(const string str : arr){
        cout << str << "\n";
    }
    return 0;
}

// #include<iostream>
// #include<vector>
// #include<algorithm>
// // #include<hash_set>
// #include<set>
// using namespace std;

// bool cmp(string str1, string str2){
//     if(str1.length()==str2.length()){
//         return str1 < str2;
//     }
//     return str1.length() < str2.length();
// }

// int main(){
//     int N = 0;
//     cin >> N;
//     string str;
//     vector<string> arr;
//     // hash_map<string, bool> set;
//     // hash_set<string> set1;
//     set<string> set1;
//     for(int i = 0; i < N; ++i){
//         cin >> str;
//         if(set1.find(str)==set1.end()){
//             set1.insert(str);
//             arr.push_back(str);
//         }
//     }
//     sort(arr.begin(), arr.end(), cmp);
//     for(int i = 0; i < N; ++i){
//         cout << arr[i] << "\n";
//     }
//     return 0;
// }