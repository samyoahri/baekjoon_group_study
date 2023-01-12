#include <iostream>
#include <stdio.h>
#include <string.h>
#include <queue>
//
using namespace std;


int main() {
	cin.tie(NULL);
	cin.sync_with_stdio(false);
	cout.sync_with_stdio(false);
	int N, K;
	long long cnt=0;
	cin >> N >> K;
	string NAME[300001];
	queue<int> qu[21]; //등수가 들어갈 queue
	for (int i = 0; i < N; i++) {
		cin >> NAME[i];
	}
	for (int j= 0; j < N; j++) {
		int len = NAME[j].length();//string에 들어온 이름의 길이
		while (!qu[len].empty() && j - qu[len].front() > K) //queue에 길이에 해당하는것에 등수 보다 높은 번쨰 친구가 들어오면 queue에서 제외 
			qu[len].pop(); 
		cnt += qu[len].size();//queue에는 자연스레 끼리끼리 모임
		qu[len].push(j);//계속 등수를 밀어넣을 것임
	}
	cout << cnt;
	return 0;
}

