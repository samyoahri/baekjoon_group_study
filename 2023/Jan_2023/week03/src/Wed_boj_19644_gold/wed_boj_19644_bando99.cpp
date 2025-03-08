#include <iostream>
#include <queue>


using namespace std;

/*
	�������

	����� ���� ���� �Ÿ� L(m) , �����κ��� i(m)������ ���� ������ ü�� Z_i

	����� �������� ų���� ����� ���� 1(m) �̵��� �� ����� �Ǵ� ���ڸ� �ѹ� ��밡��
	���ڰݹ߽� ����ǳ�� ���ϱ����� ��������� ������ ����� �Ѵ�.
	=> ����Ѱ� ���ڰݹ��� ���ÿ� x

	��ȿ��Ÿ��� ���������� M_l(m)
	1(m) �� ���� ü���� M_k ��ŭ �����.

	���� ������ C_ammo
	1(m)������ ������ ���� ���и��� �� ų���� ����� ���



	�Է�
	ù��° �� : �������� ���� �Ÿ� L (1 <= L <= 3 * 10^6)
	�ι�° �� : ������� ��ȿ��Ÿ� M_l (1 <= M_l <= 3 * 10^6)
				1(m) �� ���� M_k(1 <= M_k <= 100)
	����° �� : ������ ���� C_ammo  (0 <= C_ammo <= 3 * 10^6)
	�׹�° �� : L���� �ٿ� ���ļ� ���� 1����
				i��° ������ ������������� i(m) ������ ���� ���� ü�� Z_i

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

	//i ��° ���� ü�� ť
	queue<int> Z;
	//������� ����
	MG gun(M_l, M_k);

	//===========newlogic
	int j = 1;

	bool result = true;

	for (int i = 0; i < L; i++) {

		cin >> Z_i;

		//���� ���
		if ((gun.k * j) < Z_i) {
			if (C_ammo > 0) {
				//cout << "���� ��� : " << C_ammo << " ����" << endl;
				C_ammo = C_ammo - 1;
				Z_i = 0;
			}
			else {
				result = false;
			}
		}
		//����� ���
		else {
			//cout << "����� ��� Z_i = " << Z_i << endl;
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