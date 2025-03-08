#include <stdio.h>

typedef struct stack {
    int stk[100001];
    int top;
}Stack;

void init(Stack* stack) {
    stack->top = 0;
}

int empty(Stack* stack) {
    return (stack->top == 0);
}

void push(Stack* stack, int data) {
    stack->stk[++stack->top] = data;
}

int pop(Stack* stack) {
    if(empty(stack)) return 0;
    else return stack->stk[stack->top--];
}

int sum(Stack* stack) {
    int sum = 0;
    while(!empty(stack)) {
        sum += pop(stack);
    }
    return sum;
}

int main() {
    int K;
    scanf("%d", &K);
    
    int data;
    Stack stack; init(&stack);
    for(int i = 0; i < K; i++) {
        scanf("%d", &data);
        if(data == 0) pop(&stack);
        else push(&stack, data);
    }
    
    printf("%d", sum(&stack));
    
}