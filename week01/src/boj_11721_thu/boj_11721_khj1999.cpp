#include <iostream>
using namespace std;
int main() {
	char ch;
	int cnt = 0;
	while (scanf("%c", &ch) != EOF) {
		printf("%c", ch);
		cnt++;
		if (cnt == 10) {
			printf("\n");
			cnt = 0;
		}
	}
	return 0;
}