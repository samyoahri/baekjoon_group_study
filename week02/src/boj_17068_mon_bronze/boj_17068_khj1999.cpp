#include <bits/stdc++.h>
using namespace std;
int arr[100001];

int main(){
    int n, top = 0, cnt = 0;
    cin >> n;
    for(int i = 0; i < n; i++) cin >> arr[i];
    for(int i = n - 1; i > -1; i--){
        if(arr[i] > top){
            cnt++; top = arr[i];
        }
    }
    cout << cnt;
    return 0;
}