#include <stack>
#include <iostream>

using namespace std;

int main(){
    int K; //첫 번째 줄 주어지는 정수 K
    int input; // 이후 K개의 줄에 주어질 정수
    int output = 0; //최종적으로 적어낸 수의 합
    stack<int> stack;
    cin >> K;

    for(int i = 0; i < K ; i++){ // K개의 줄에 정수가 주어진다.
        cin >> input;
        if( input == 0){ //정수가 "0"일 경우 
          stack.pop();  //가장 최근에 쓴 수를 지운다. 
        }
        else{ //아닐 경우
            stack.push(input); //해당 수를 쓴다.
        }
    }
    int stack_size = stack.size();
    for(int i = 0; i< stack_size; i++){ // 스택의 원소를 하나씩 출력하여 합을 출력한다.
        output += stack.top();
        stack.pop();
    }
    cout << output;

    return 0;
}