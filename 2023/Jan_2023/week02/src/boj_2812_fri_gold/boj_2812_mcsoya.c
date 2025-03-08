#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

typedef struct {
	int* stk;
	int top;
}Stack;

void init(Stack* stack, int max) {
	stack->stk = (int*)calloc(max + 1, sizeof(int));
	stack->top = 0;
}

int isEmpty(Stack* stack) {
	return (stack->top == 0);
}

void push(Stack* stack, int data) {
	stack->stk[++stack->top] = data;
}

int pop(Stack* stack) {
	if (!isEmpty(stack)) return stack->stk[stack->top--];
	else return -1;
}

int peak(Stack* stack) {
	if (!isEmpty(stack)) return stack->stk[stack->top];
	else return INT_MAX;
}

void dispose(Stack* stack) {
	free(stack->stk);
}

int main() {
	int N; scanf("%d", &N);
	int* datas = (int*)calloc(N + 1, sizeof(int));

	int k; scanf("%d", &k);
	Stack stack; init(&stack, N);

	char str[500001]; scanf("%s", str);
	for (int i = 0; i < N; i++) {
		datas[i + 1] = str[i] - 48;
	}

	int i, cnt = 1;
	for (i = 1; i <= N; i++) {
		if (datas[i] > peak(&stack)) {
			while (peak(&stack) < datas[i]) {
				if (cnt++ > k) break;
				pop(&stack);
			}
		}
		push(&stack, datas[i]);
		if (cnt > k) break;
	}

	for(int j = i + 1; j <= N; j++) push(&stack, datas[j]);

	while (cnt <= k) {
		pop(&stack);
		cnt++;
	}

	for (int i = 1; i <= stack.top; i++) {
		printf("%d", stack.stk[i]);
	}

	dispose(&stack);
	free(datas);
}