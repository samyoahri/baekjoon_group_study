#include<iostream>

using namespace std;
long long int factorial(int n){
    if(n==1||n==0)    return 1;
    return n * factorial(n-1);
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);

    int N = 0;
    cin >> N;
    cout << factorial(N);

    return 0;
}