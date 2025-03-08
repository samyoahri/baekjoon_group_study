#include <stdio.h>
#define MAX_LEN 101

typedef struct stack {
	char stk[MAX_LEN];
	int top;
}Stack;

void init(Stack* stack) {
	stack->top = 0;
}

void push(Stack* stack, char letter) {
	stack->stk[stack->top++] = letter;
}

int checkPop(Stack* stack, int checking_arr[]) {
	char ch = stack->stk[--stack->top];
	if (checking_arr[ch - 97] > 0)	return 0;
	if (stack->top > 0) {
		char ch_test = stack->stk[stack->top - 1];

		while ((ch == ch_test) && (stack->top > 0)) {
			ch_test = stack->stk[--stack->top - 1];
		}
		checking_arr[ch - 97] = 1;
	}
	return 1;
}

//────────────────────────────────────────

int main() {
	Stack stack;
	int N, res, total = 0;

	scanf("%d", &N);
	for (int i = 0; i < N; i++) {
		char str[MAX_LEN];  scanf("%s", str);
		init(&stack);

		for (int i = 0; str[i] != '\0'; i++) push(&stack, str[i]);
		int checking_arr[26] = { 0 };

		while (stack.top > 0) {
			res = checkPop(&stack, checking_arr);
			if (res == 0) break;
		}
		if (res == 1) total++;
	}
	printf("%d", total);	// 결과 출력
}