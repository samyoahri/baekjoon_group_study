
#include <iostream>
#include <vector>
using namespace std;


/*
*	week_02_sunday_gold
*	입력 :
*	첫째 줄 :탑의 수를 나타내는 정수 N(1 <= N <= 500,000 )
*	둘째 줄 :N개의 탑들의 높이가 직선상에 놓인 순서대로 하나의 빈칸을 사이에 두고 주어진다.(1<= 높이 <=100,000,000)
*
*	출력 :
*	첫째 줄에 주어진 탑들의 순서대로 각각의 탑들에서 발사한 레이저 신호를 수신한 탑들의 번호를 사이에 두고 출력
*	만약 신호를 수신하지 않는 탑이 존재하면 0을 출력.
*/


// 1.탑의 개수를 입력하는 함수.
// 2.탑의 높이를 입력하는 함수.
//	수정) 1,2를 숫자를 입력하는 함수로 통일하고 탑의 높이를 받는 함수는 동적list로 출력한다.
// 3.비지니스 로직.


int input_num() {
	int input;
	cin >> input;
	return input;
}

struct top {
	int id;
	int height;
	int result;


};


int result_operate(vector<top> topArr, int result, int index) {
	if (result == 0) {
		return 0;
	}
	if (topArr[result].height >= topArr[index].height) {
		return result;
	}
	return result_operate(topArr, topArr[result].result, index);
}



int main() {

	int N;// 탑의 개수
	int height; //탑의 높이

	//높이 입력
	N = input_num();
	vector<top> topArr(N + 1);

	//topArr 초기화

	topArr[0].id = 1;
	topArr[0].height = 0;
	topArr[0].result = 0;
	for (int i = 1; i < N + 1; i++) {
		cin >> height;
		topArr[i].id = i;
		topArr[i].height = height;
	}
	for (int i = 1; i < N + 1; i++) {
		topArr[i].result = result_operate(topArr, i - 1, i);
	}


	for (int i = 1; i < N + 1; i++) {
		cout << topArr[i].result << "  ";
	}


	return 0;
}