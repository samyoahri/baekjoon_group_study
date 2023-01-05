#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    stack<char> s;
    string str;
    int stick = 0;
    cin >> str;
    int len = str.length();
    for (int i = 0; i < len; i++) {
        if(str[i] == '(') s.push(str[i]);
        else {
            s.pop();
            if (str[i - 1] == '(') stick += s.size();
            else if(str[i - 1] == ')') stick++;
        }
    }
    cout << stick;
    return 0;
}