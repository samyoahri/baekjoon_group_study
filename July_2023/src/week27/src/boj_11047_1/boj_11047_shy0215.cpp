#include <iostream>

using namespace std;

int main(){
    int N, K; // 주어지는 N, K
    int input[10]; // 동전의 가치, 1 <= N <= 10 
    cin >> N >> K;
    int output = 0;
    for(int i = 0; i < N; i++){
        cin >> input[i];
    }
    for(int i = N - 1; i >= 0; i--){ //동전의 가치가 오름차순으로 주어졌으니까 큰수부터 나눠준다. 
        if(K == 0){
            break;
        }
        output += K /input[i]; //몫을 저장
        K = K % input[i]; //나머지 저장
    }
    cout << output;
    return 0; 
}