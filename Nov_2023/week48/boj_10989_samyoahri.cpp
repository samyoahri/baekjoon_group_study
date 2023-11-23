#include<iostream>
using namespace std;
// #define tenMilion 10000000
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);cout.tie(0);
    // cout << "hello world\n";
    int N = 0;
    cin >> N;
    int arr[10001] = {0};
    int num = 0;
    for(int i = 0; i < N; ++i){
        cin >> num;
        ++arr[num];
    }
    for(int i = 1; i < 10001; ++i){
        if(arr[i]==0) continue;
        while(arr[i]-- > 0){
            cout << i << "\n";
        }
    }
    return 0;
}