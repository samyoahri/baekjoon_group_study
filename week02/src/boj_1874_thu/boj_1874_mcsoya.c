#include <stdio.h>
#include <stdlib.h>

#define MAX_LEN 1000000

typedef struct stack {
	int* stk;
	int top;
}Stack;

void init(Stack* stack, int max) {
	stack->stk = (int*)calloc(max + 1, sizeof(int));
	stack->top = 0;
}

void push(Stack* stack, int data) {
	stack->stk[++stack->top] = data;
}

int pop(Stack* stack) {
	if (stack->top > 0) return stack->stk[stack->top--];
	else return -1;
}

int peak(Stack* stack) {
	if (stack->top > 0) return stack->stk[stack->top];
	else return -1;
}

int isEmpty(Stack* stack) {
	return (stack->top == 0);
}

int main() {
	int N;
	scanf("%d", &N);

	int* data = (int*)calloc(N + 1, sizeof(int));
	char* res = (char*)calloc(MAX_LEN, sizeof(char));
	int pos = 1;

	for (int i = 1; i <= N; i++) {
		scanf("%d", &data[i]);
	}

	Stack stack; init(&stack, N);

	int idx = 0;
	for (int i = 1; i <= N; i++) {
		if (peak(&stack) == data[pos]) {
			while ((peak(&stack) == data[pos]) && (pos <= N)) {
				pop(&stack); res[idx++] = '-'; pos++;
			}
			i--;
		}
		else {
			push(&stack, i); res[idx++] = '+';
		}
	}

	while ((peak(&stack) == data[pos]) && (pos <= N)) {
		pop(&stack); res[idx++] = '-'; pos++;
	}

	if (!isEmpty(&stack)) printf("NO");
	else {
		for (int i = 0; i < idx; i++) {
			printf("%c\n", res[i]);
		}
	}

	free(data);
	free(res);
}