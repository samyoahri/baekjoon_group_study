#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
bool desc(int num1, int num2){
    return num1 > num2;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(0);
    int N, K;
    cin >> N >> K;
    vector<int> vec(N);
    for(int i = 0; i < N; ++i){
        cin >> vec[i];
    }
    sort(vec.begin(), vec.end(), desc);
    cout << vec[K-1];
    return 0;
}