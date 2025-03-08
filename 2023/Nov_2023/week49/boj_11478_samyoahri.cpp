#include<iostream>
#include<unordered_set>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    string str;
    cin >> str;
    unordered_set<string> subSetString;
    string tmp;
    string s;
    for(int i = 0; i < str.length(); ++i){
        for(int j = i; j < str.length(); ++j){
            s+=str[j];
            subSetString.insert(s);
        }
        s = "";
    }

    cout << subSetString.size();
    return 0;
}
// #include<iostream>
// #include<unordered_set>

// using namespace std;

// int main(){
//     ios_base::sync_with_stdio(false);
//     cin.tie(NULL); cout.tie(0);
//     string str;
//     cin >> str;
//     unordered_set<string> subSetString;
//     string tmp;
//     for(int i = 0; i < str.length(); ++i){
//         for(int j = 1; j < str.length() + 1; ++j){
//             string subString = str.substr(i, j);
//             if(subSetString.find(subString)==subSetString.end()){
//                 subSetString.insert(subString);
//             }
//         }
//     }
//     cout << subSetString.size();
//     return 0;
// }