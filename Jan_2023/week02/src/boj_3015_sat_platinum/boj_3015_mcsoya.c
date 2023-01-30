#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct item {
	unsigned int key;
	unsigned int value;
}Item;

typedef struct stack {
	Item* stk;		
	int top;
}Stack;

void init(Stack* stack, int max) {
	stack->stk = (Item*)calloc(max + 2, sizeof(Item));
	stack->top = 0;
}

int isEmpty(Stack* stack) {
	return (stack->top == 0);
}

void push(Stack* stack, unsigned int key, unsigned int value) {
	Item new_item = { key, value };
	stack->stk[++stack->top] = new_item;
}

void pop(Stack* stack) {
	if (!isEmpty(stack)) stack->top--;
}

Item peak(Stack* stack) {
	return stack->stk[stack->top];
}

unsigned int size(Stack* stack) {
	return stack->top;
}

void dispose(Stack* stack) {
	free(stack->stk);
}

// --------------------------------------------------------------------------------------------------

int main() {
	unsigned long long answer = 0;		// 결과값(int 범위를 넘어선다는 말이 있었으므로, 이를 참조함)
	int N;
	scanf("%d", &N);

	unsigned int data;
	Stack stack; init(&stack, N);

	for (int i = 0; i < N; i++) {
		scanf("%d", &data);
		if (!isEmpty(&stack)) {
			Item top = peak(&stack);
			while ((!isEmpty(&stack)) && (top.key < data)) {
				answer += top.value;
				pop(&stack);
				top = peak(&stack);
			}
			
			if (!isEmpty(&stack)) {
				Item pk = peak(&stack);
				if (pk.key == data) {
					pop(&stack); push(&stack, data, pk.value + 1);		// 값 갱신

					answer += peak(&stack).value - 1;
					if (size(&stack) > 1) answer++;
				}
				else {
					answer++;
					push(&stack, data, 1);
				}
			}
			else push(&stack, data, 1);
		}
		else push(&stack, data, 1);
	}

	printf("%llu", answer);
	dispose(&stack);
}