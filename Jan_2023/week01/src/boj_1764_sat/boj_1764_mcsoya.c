#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct item {
	char data[21];
}Item;

int cmp_a(const void* a, const void* b) {
	return strcmp((char*)a, (char*)b);
}

int main() {
	int A, B;
	
	// 횟수 입력
	scanf("%d %d", &A, &B);

	Item* items = (Item*)calloc(A + B, sizeof(Item));

	// 입력: A, B
	for (int i = 0; i < A + B; i++) {
		scanf("%s", items[i].data);
	}
	qsort(items, A + B, sizeof(Item), cmp_a);

	// 체크
	int total = 0;
	int len = A + B;
	Item* chk_items = (Item*)calloc(len, sizeof(Item));
	for (int i = 0; i < len - 1; i++) {
		if (strcmp(items[i].data,items[i + 1].data) == 0) {
			strcpy(chk_items[total++].data, items[i++].data);
		}
	}
	
	// 출력
	printf("%d\n", total);
	for (int i = 0; i < total; i++) {
		printf("%s\n", chk_items[i].data);
	}

	free(items);
	free(chk_items);
}