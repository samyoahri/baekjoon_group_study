#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct queue {
	char arr[300001][21];
	int front;
	int rear;
}Queue;

void init(Queue* queue) {
	queue->front = 1;
	queue->rear = 1;
}

int isEmpty(Queue* queue) {
	if (queue->front == queue->rear) return 1;
	else return 0;
}

void push(Queue* queue, char* str) {
	strcpy(queue->arr[queue->rear++], str);
}

char* pop(Queue* queue) {
	return queue->arr[queue->front++];
}

int size(Queue* queue) {
	return (queue->rear - queue->front);
}

int main() {
	int N, K;
	scanf("%d %d", &N, &K);

	long long result = 0;
	char str[21];
	Queue queue; init(&queue);

	int calc[19] = { 0 };
	for (int i = 1; i <= N; i++) {
		scanf("%s", str); push(&queue, str);
		result += (calc[strlen(str) - 2]++);		// 자기 자신을 포함해서는 안됨

		// Pop 조건문
		if ((size(&queue)) == K + 1) {
			char* tmp = pop(&queue);
			calc[strlen(tmp) - 2]--;
		}
		
	}
	
	printf("%lld", result);
}