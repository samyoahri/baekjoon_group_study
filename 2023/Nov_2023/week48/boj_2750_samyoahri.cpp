#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int N = 0;
    cin >> N;
    vector<int> vector(N);
    for(int i = 0; i < N; ++i){
        cin >> vector[i];
    }
    sort(vector.begin(), vector.end());
    for(int i = 0; i < N; ++i){
        cout << vector[i] << "\n";
    }

    return 0;
}