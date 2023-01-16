#include <stdio.h>

typedef struct queue {
	int arr[25000001];
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

int dequeue(Queue* queue) {
	if (!isEmpty(queue)) return queue->arr[queue->front++];
	else return -1;
}

int main() {
	int N, K;
	scanf("%d %d", &N, &K);

	Queue queue; init(&queue);
	for (int i = 1; i <= N; i++) enqueue(&queue, i);

	int cnt = 0;
	printf("<");
	while (!isEmpty(&queue)) {
		if (++cnt % K == 0) {
			printf("%d", dequeue(&queue));
			if (!isEmpty(&queue)) printf(", ");
		}
		else enqueue(&queue, dequeue(&queue));
	}
	printf(">");
}