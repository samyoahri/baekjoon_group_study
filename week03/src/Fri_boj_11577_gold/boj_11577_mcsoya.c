#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

typedef struct queue {
	int arr[100001];
	int front;
	int rear;
}Queue;

void init(Queue* queue) {
	queue->front = 0;
	queue->rear = 0;
}

int isEmpty(Queue* queue) {
	return (queue->rear - queue->front == 0);
}

void enqueue(Queue* queue, int data) {
	queue->arr[queue->rear++] = data;
}

void dequeue(Queue* queue) {
	if(!isEmpty(queue)) queue->front++;
}

int front(Queue* queue) {
	return queue->arr[queue->front];
}

int size(Queue* queue) {
	return (queue->rear - queue->front);
}

int main() {
	int result = 0;
	int N, K;	// 전구 개수, 한번에 반전 가능한 전구 개수
	scanf("%d %d", &N, &K);

	Queue queue; init(&queue);

	int data, i;
	for (i = 1; i <= N; i++) {
		scanf("%d", &data);

		if (!isEmpty(&queue)) {
			if (size(&queue) % 2 != 0) data = !data;
			if (i >= front(&queue)) dequeue(&queue);
		}

		if (data == 1) {
			result++;
			if (i > N - K + 1) break;
			else enqueue(&queue, i + K - 1);
		}
	}

	if (i <= N) printf("Insomnia");
	else printf("%d", result);
}