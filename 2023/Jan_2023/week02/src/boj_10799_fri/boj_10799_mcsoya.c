#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct stack {
	char stk[100001];
	int top;
}Stack;

void init(Stack* stack) {
	stack->top = 0;
}

void push(Stack* stack, char ch) {
	stack->stk[++stack->top] = ch;
}

void pop(Stack* stack) {
	if (stack->top > 0) stack->top--;
}

int size(Stack* stack) {
    return stack->top;
}

int main() {
	int result = 0;
	char str[100001];
	gets(str);

	int len = strlen(str);
	Stack stack; init(&stack);

	for(int i = 0; i < len; i++) {
		char ch = str[i];
		if (ch == '(') {
			if (str[i + 1] == ')') {
				result += size(&stack);     // () 앞의 라인 체크
				i++;
			}
			else push(&stack, ch);
		}
		else {
			result++;
			pop(&stack);
		}
	}
	printf("%d\n", result);
}