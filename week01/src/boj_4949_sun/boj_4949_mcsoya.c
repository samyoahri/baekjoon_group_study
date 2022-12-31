#define MAX_SIZE 102
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct stack {
	char letters[MAX_SIZE];
	int top;
}Stack;

int stack_length(Stack* stack) {
	return stack->top;
}

char top(Stack* stack) {
	if (stack->top > 0) return stack->letters[stack->top];
	return -1;
}

void pop(Stack* stack) {
	if (stack->top > 0) stack->top--;
}

void push(Stack* stack, char letter) {
	if (stack->top < MAX_SIZE) {
		if (stack_length(stack) > 0) {
			char ch = top(stack);
			if ((ch == '(') && (letter == ')')) pop(stack);
			else if ((ch == '[') && (letter == ']')) pop(stack);
			else stack->letters[++stack->top] = letter;
		}
		else stack->letters[++stack->top] = letter;
	}
}

void clear(Stack* stack) {
	stack->top = 0;
}

int main() {
	char result[10000][MAX_SIZE];
	int cnt = 0;
	Stack stack;
	while (1) {
		fgets(result[cnt], MAX_SIZE, stdin);
		if ((strlen(result[cnt]) - 1) == 1) {
			if (result[cnt][0] == '.') break;
		}

		clear(&stack);
		for (int i = 0; result[cnt][i] != '.'; i++) {
			char ch = result[cnt][i];
			switch (ch) {
				case '(': case ')': case '[': case ']':
					push(&stack, ch);
					break;
				default:
					break;
			}
		}
		// 값이 남아있다면
		if (stack_length(&stack) > 0) printf("no\n");
		else printf("yes\n");

		cnt++;
	}
}