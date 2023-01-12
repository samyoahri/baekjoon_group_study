#include <stdio.h>

typedef struct queue {
	int arr[1000001];
	int front;
	int rear;
}Queue;

void init(Queue* queue) {
	queue->front = 1;
	queue->rear = 1;
}

int isEmpty(Queue* queue) {
	return ((queue->rear - queue->front) == 0);
}

void enqueue(Queue* queue, int data) {
	queue->arr[queue->rear++] = data;
}

int dequeue(Queue* queue) {
	if (isEmpty(queue)) return -1;
	else return queue->arr[queue->front++];
}

int size(Queue* queue) {
	return queue->rear - queue->front;
}

int main() {
	int N, K;
	Queue queue; init(&queue);

	scanf("%d %d", &N, &K);
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