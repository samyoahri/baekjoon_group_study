#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct item {
	char str[1000];
}Item;

typedef struct stack {
	Item stk[1000];
	int top;
}Stack;

void init(Stack* stack) {
	stack->top = 0;
}

void push(Stack* stack, char* str) {
	Item item; strcpy(item.str, str);
	stack->stk[++stack->top] = item;
}

Item pop(Stack* stack) {
	return stack->stk[stack->top--];
}

int isEmpty(Stack* stack) {
	return (stack->top == 0);
}

int main() {
	int N; scanf("%d", &N);

	char str[1000];
	Stack stack;
	getchar();
	for (int i = 1; i <= N; i++) {
		gets(str); init(&stack);

		char* ptr = strtok(str, " ");
		while (ptr != NULL) {
			push(&stack, ptr);
			ptr = strtok(NULL, " ");
		}

		printf("Case #%d:", i);
		while (!isEmpty(&stack)) {
			printf(" %s", pop(&stack).str);
		}
		printf("\n");
	}
}