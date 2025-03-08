#include <iostream>
#include <string>
#include <stack>
using namespace std;
stack <char> s;
string vps(string);
int main(){
    int n;
    cin >> n;
    string a[n];
    for (int i = 0;i<n;i++){
        cin >> a[i];
    }
    for (int i = 0;i<n;i++){
        cout << vps(a[i]) <<endl ;
    }
}
string vps(string k){
    for(int i = 0;i < k.size();i++){
        if(  ((k[i] == ')') && !s.empty() ) && (s.top()=='(')){
            s.pop();
        }
        else if ( k[i] == ')' || k[i]=='(') {
            s.push(k[i]);
        }
    }
    if(!s.empty()){
        while (!s.empty()) {
                s.pop();
            }
        return "NO";
    }
    else{
        
        return "YES";
    }
    
}
