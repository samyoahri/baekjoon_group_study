#include <cmath>
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
 
int main() {
	int N;
	vector<int> v; //등수
	long long int ans = 0; 
 
	cin >> N;
	for (int i = 0; i < N; i++) {
		int num;
		cin >> num;
		v.push_back(num);
	}
 
	sort(v.begin(), v.end()); 

	for (int i = 1; i <= N; i++) {
		ans = ans + abs(i - v[i - 1]);
	}
    
	cout << ans;
}