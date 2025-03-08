#include <stdio.h>
#include <stdlib.h>

typedef struct item {
	int data;
	int pos;
}Item;

typedef struct stack {
	Item* stk;
	int top;
}Stack;

void init(Stack* stack, int max) {
	stack->stk = (Item*)calloc(max + 1, sizeof(Item));
	stack->top = 0;
}

int isEmpty(Stack* stack) {
	return (stack->top == 0);
}

Item peak(Stack* stack) {
	return stack->stk[stack->top];
}

void pop(Stack* stack) {
	if(!isEmpty(stack)) stack->top--;
}

void push(Stack* stack, int data, int pos) {
	Item item = { data,pos };
	stack->stk[++stack->top] = item;
}

int main() {
	int N;
	scanf("%d", &N);

	int data;
	Stack stack; init(&stack, N);
	for (int i = 1; i <= N; i++) {
		scanf("%d", &data);

		if (isEmpty(&stack)) printf("0 ");
		else {
			while ((!isEmpty(&stack)) && (peak(&stack).data <= data)) {
				pop(&stack);
			}

			Item top = peak(&stack);
			if (!isEmpty(&stack)) {
				if (top.data > data) printf("%d ", top.pos);
			}
			else printf("0 ");
		}
		push(&stack, data, i);
	}
}