#include<iostream>
#include<queue>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N = 0;
    cin >> N;
    vector<int> arr(N);
    priority_queue<int,vector<int>, greater<int>> cardsDequeASC;
    for(int i = 0; i < N; ++i){
        cin >> arr[i];
    }
    sort(arr.begin(), arr.end());
    for (const int& cards : arr){
        cardsDequeASC.push(cards);
    }
    int ans = 0, cnt = 0, tmp = 0;
    while(cardsDequeASC.size()!=1){
        ++cnt;
        int cards1 = cardsDequeASC.top();
        cardsDequeASC.pop();
        int cards2 = cardsDequeASC.top();
        cardsDequeASC.pop();
        cardsDequeASC.push(cards1+cards2);
        ans += (cards1 + cards2);
    }
    if(cnt==0){
        ans = cardsDequeASC.top();
    }
    

    cout << ans;
    return 0;
}
// #include<iostream>
// #include<queue>
// #include<vector>
// #include<algorithm>
// using namespace std;

// int main(){
//     ios_base::sync_with_stdio(false);
//     cin.tie(NULL); cout.tie(0);
//     int N = 0;
//     cin >> N;
//     vector<int> arr(N);
//     priority_queue<int,vector<int>, greater<int>> cardsDequeASC;
//     for(int i = 0; i < N; ++i){
//         cin >> arr[i];
//     }
//     sort(arr.begin(), arr.end());
//     for (const int& cards : arr){
//         cardsDequeASC.push(cards);
//     }
//     int ans = 0, cnt = 0, tmp = 0;
//     while(!cardsDequeASC.empty()){
//         ++cnt;
//         if(cnt%2==1){
//             tmp += cardsDequeASC.top();
//             cardsDequeASC.pop();
//         }
//         else{
//             tmp += cardsDequeASC.top();
//             cardsDequeASC.pop();
//             cardsDequeASC.push(tmp);
//             ans += tmp;
//             tmp = 0;
//         }
//     }
//     cout << ans;
//     return 0;
// }