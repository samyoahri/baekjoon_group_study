#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
// bool desc(int a, int b){
//     return a > b;
// }
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N;
    cin >> N;
    vector<int> arr(N);
    for(int i = 0; i < N; ++i){
        cin >> arr[i];
    }
    sort(arr.begin(), arr.end());
    for(int i = 0; i < N; ++i){
        cout << arr[i] << "\n";
    }
    return 0;
}