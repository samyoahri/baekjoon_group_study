
#include <iostream>
#include <vector>
using namespace std;


/*
*	week_02_sunday_gold
*	�Է� :
*	ù° �� :ž�� ���� ��Ÿ���� ���� N(1 <= N <= 500,000 )
*	��° �� :N���� ž���� ���̰� ������ ���� ������� �ϳ��� ��ĭ�� ���̿� �ΰ� �־�����.(1<= ���� <=100,000,000)
*
*	��� :
*	ù° �ٿ� �־��� ž���� ������� ������ ž�鿡�� �߻��� ������ ��ȣ�� ������ ž���� ��ȣ�� ���̿� �ΰ� ���
*	���� ��ȣ�� �������� �ʴ� ž�� �����ϸ� 0�� ���.
*/


// 1.ž�� ������ �Է��ϴ� �Լ�.
// 2.ž�� ���̸� �Է��ϴ� �Լ�.
//	����) 1,2�� ���ڸ� �Է��ϴ� �Լ��� �����ϰ� ž�� ���̸� �޴� �Լ��� ����list�� ����Ѵ�.
// 3.�����Ͻ� ����.


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

	int N;// ž�� ����
	int height; //ž�� ����

	//���� �Է�
	N = input_num();
	vector<top> topArr(N + 1);

	//topArr �ʱ�ȭ

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