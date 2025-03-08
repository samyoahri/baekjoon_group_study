#include<iostream>
using namespace std;
int factorial(int n){
    if(n == 0)          return 0;
    else if(n == 1)     return 1;
    else                return factorial(n-1) + factorial(n-2);
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);  cout.tie(0);
    int N = 0;
    cin >> N;
    cout << factorial(N);
    return 0;
}