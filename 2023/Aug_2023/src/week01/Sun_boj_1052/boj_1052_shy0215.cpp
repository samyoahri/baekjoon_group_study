#include <iostream>
using namespace std;

int main() {
    int N, K;
    cin >> N >> K;

	if(K >= N){
		cout << 0;
	} else {
		int output = 0;

		while(1) {
			int cnt = 0;
            int tempN = N;
			while(tempN > 0) {
				if(tempN % 2 == 0) {
					tempN /= 2;
				}else {
				  tempN /= 2;
				  cnt++;
				}
			}
			if(K >= cnt) {
				break;
			}
			N++;
			output++;
		}
		cout << output;
	}
	return 0;
}
