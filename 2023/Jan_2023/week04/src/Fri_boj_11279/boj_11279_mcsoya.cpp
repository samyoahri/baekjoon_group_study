#include <iostream>
#include <queue>
#include <functional>

using namespace std;

int main() {
	priority_queue<long long int, vector<long long int>, less<long long int>> queue;
	int N;
	long long int data;
	
	scanf("%d", &N);
	for (int i = 1; i <= N; i++) {
		scanf("%lld", &data);

		if (data) queue.push(data);
		else {
			if (queue.empty()) printf("0\n");
			else {
				printf("%lld\n", queue.top());
				queue.pop();
			}
		}
	}
}