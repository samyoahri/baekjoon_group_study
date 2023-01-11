#include <iostream>
#include <queue>


using namespace std;

/*
	좀비사태

	기관총 진지 앞의 거리 L(m) , 진지로부터 i(m)떨어진 곳에 좀비의 체력 Z_i

	기관총 진지에서 킬리와 헥토는 좀비가 1(m) 이동할 때 기관총 또는 지뢰를 한번 사용가능
	지뢰격발시 후퐁풍을 피하기위해 기관총진지 밑으로 숨어야 한다.
	=> 기관총과 지뢰격발은 동시에 x

	유효사거리는 진지앞으로 M_l(m)
	1(m) 당 좀비 체력을 M_k 만큼 낮춘다.

	지뢰 갯수는 C_ammo
	1(m)떨어진 길위의 좀비를 제압못할 시 킬리와 헥토는 사망



	입력
	첫번째 줄 : 진지앞쪽 길의 거리 L (1 <= L <= 3 * 10^6)
	두번째 줄 : 기관총의 유효사거리 M_l (1 <= M_l <= 3 * 10^6)
				1(m) 당 살상력 M_k(1 <= M_k <= 100)
	세번째 줄 : 지뢰의 갯수 C_ammo  (0 <= C_ammo <= 3 * 10^6)
	네번째 줄 : L개의 줄에 걸쳐서 정수 1개씩
				i번째 정수는 기관총진지에서 i(m) 떨어진 곳의 좀비 체력 Z_i

	*/

struct MG {
	int l;
	int k;
	MG(int M_l, int M_k) {
		l = M_l;
		k = M_k;
	}
};




int main() {


	//1 2 2 0 3
	//init()===============================
	int L;
	int M_l;
	int M_k;
	int C_ammo;
	int Z_i;


	cin >> L;
	cin >> M_l >> M_k;
	cin >> C_ammo;

	//i 번째 좀비 체력 큐
	queue<int> Z;
	//기관총의 스펙
	MG gun(M_l, M_k);

	//===========newlogic
	int j = 1;

	bool result = true;

	for (int i = 0; i < L; i++) {

		cin >> Z_i;

		//지뢰 사용
		if ((gun.k * j) < Z_i) {
			if (C_ammo > 0) {
				//cout << "지뢰 사용 : " << C_ammo << " 남음" << endl;
				C_ammo = C_ammo - 1;
				Z_i = 0;
			}
			else {
				result = false;
			}
		}
		//기관총 사용
		else {
			//cout << "기관총 사용 Z_i = " << Z_i << endl;
			Z_i = Z_i - j * gun.k;
			if (Z_i > 0) {
				result = false;
			}
			else {
				if (j < gun.l) {
					j = j + 1;
				}
			}
		}
		//cout << "j :" << j << endl;

	}
	if (result == true) {
		cout << "YES";
	}
	else {
		cout << "NO";
	}


	return 0;
}