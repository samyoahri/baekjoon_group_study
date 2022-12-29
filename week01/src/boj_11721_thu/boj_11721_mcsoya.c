#include <stdio.h>
#include <string.h>

void get_answer(char* str, int len) {
	char tmp[113] = "";
	int stlen = 0;
	while (stlen < len) {
		strncat(tmp, str + stlen, 10);	strcat(tmp, "\n");
		stlen += 10;
	}
	printf("%s", tmp);
}

int main() {
	char str[101];
	scanf("%s", str);

	get_answer(str, strlen(str));
}