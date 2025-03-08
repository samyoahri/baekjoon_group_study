#include<iostream>
#include<functional>
using namespace std;
bool recursion(const string& str, const int& left, const int& right, const function<void()>& callback){
    callback();
    if(left>=right) return true;
    else if(str[left]!=str[right]) return false;
    else return recursion(str, left+1, right-1, callback);
}
bool isPalindrome(const string& str, const function<void()>& callback){
    return recursion(str, 0, str.length()-1, callback);
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int T = 0;
    cin >> T;
    while(T-->0){
        string str;
        int callCount = 0;
        auto callback = [&callCount](){
            callCount++;
        };
        cin >> str;
        cout << isPalindrome(str, callback);
        cout << " " << callCount << "\n";

    }
    return 0;
}