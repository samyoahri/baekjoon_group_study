#include <stdio.h>

int main() {
	char str1[101];	
	while (fgets(str1, 101, stdin))	printf("%s", str1);
}