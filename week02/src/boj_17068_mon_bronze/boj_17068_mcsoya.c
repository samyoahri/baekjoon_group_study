#include <stdio.h>
#include <stdlib.h>

typedef struct stack {
	int* stk;
	int top;
	int max;
}Stack;

void init(Stack* stack, int max) {
	stack->stk = (int*)calloc(max + 1, sizeof(int));
	stack->top = 0;
	stack->max = max + 1;
}

int isEmpty(Stack* stack) {
	return (stack->top == 0);
}

void push(Stack* stack, int data) {
	if (stack->top < stack->max) {
		stack->stk[++stack->top] = data;
	}
}

void pop(Stack* stack) {
	if (!isEmpty(stack)) {
		stack->top--;
	}
}

int st_top(Stack* stack) {
	return stack->stk[stack->top];
}

void solve(Stack* stack, int data) {
	if (stack->top < stack->max) {
			while (stack->top > 0) {
				if (st_top(stack) <= data) pop(stack);
				else {
					push(stack, data);
					break;
				}
			}
			if (isEmpty(stack)) push(stack, data);
	}
}

void dispose(Stack* stack) {
	free(stack->stk);
}

int main() {
	int N, h;
	Stack stack;

	scanf("%d", &N);
	init(&stack, N);

	for (int i = 0; i < N; i++) {
		scanf("%d", &h);
		solve(&stack, h);
	}

	printf("%d\n", stack.top);
	dispose(&stack);
}