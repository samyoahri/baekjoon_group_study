#include <stdio.h>
#include <string.h>

typedef struct stack {
	int stk[10001];
	int top;
}Stack;

void init(Stack* stack) {
	stack->top = 0;
}

int empty(Stack* stack) {
	return (stack->top == 0);
}

int size(Stack* stack) {
	return stack->top;
}

void push(Stack* stack, int data) {
	stack->stk[++stack->top] = data;
}

int top(Stack* stack) {
	if (!empty(stack)) return stack->stk[stack->top];
	return -1;
}

int pop(Stack* stack) {
	if (!empty(stack)) {
		return stack->stk[stack->top--];
	}
	return -1;
}

void solve(Stack* stack, char str[]) {
	if (strcmp(str,"push") == 0) {
		int data; scanf("%d", &data);
		push(stack, data);
	}
	else if (strcmp(str, "top") == 0) {
		printf("%d\n", top(stack));
	}
	else if (strcmp(str, "pop") == 0) {
		printf("%d\n", pop(stack));
	}
	else if (strcmp(str, "size") == 0) {
		printf("%d\n", size(stack));
	}
	else {
		printf("%d\n", empty(stack));
	}
}

int main() {
	int N;
	scanf("%d", &N);

	char str[10];
	Stack stack; init(&stack);
	for (int i = 0; i < N; i++) {
		scanf("%s", str);
		solve(&stack, str);
	}
}