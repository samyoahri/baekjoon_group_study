#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_LENGTH 51

typedef struct stack {
	char* stk;
	int top;
}Stack;

void init(Stack* stack) {
	stack->stk = (char*)calloc(MAX_LENGTH, sizeof(char));
	stack->top = 0;
}

int isEmpty(Stack* stack) {
	return (stack->top == 0);
}

void push(Stack* stack, char letter) {
	if (stack->top < MAX_LENGTH) {
		stack->stk[++stack->top] = letter;
	}
}

void clear(Stack* stack) {
	stack->top = 0;
}

int solve(Stack* stack, char str[]) {
	int len = strlen(str);
	int i;
	for (i = 0; i < len; i++) {
		char ch = str[i];
		if (ch == '(') push(stack, ch);
		else if (ch == ')') {
			if (isEmpty(stack)) break;
			else stack->top--;
		}
	}
	if (i < len) return 0;
	return isEmpty(stack);
}

void dispose(Stack* stack) {
	free(stack->stk);
}

int main() {
	int N;
	char str[MAX_LENGTH];
	Stack stack;
	init(&stack);

	scanf("%d", &N);	getchar();
	for (int i = 0; i < N; i++) {
		gets(str);
		//fgets(str, MAX_LENGTH, stdin);
		printf(solve(&stack, str) ? "YES\n" : "NO\n");
		clear(&stack);
	}
	
	dispose(&stack);
}