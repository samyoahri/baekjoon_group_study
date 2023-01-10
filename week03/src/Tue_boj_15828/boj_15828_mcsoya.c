#include <stdio.h>

typedef struct queue {
	int arr[10000001];
	int front;
	int rear;
}Queue;

void init(Queue* queue) {
	queue->front = 0;
	queue->rear = 0;
}

int isEmpty(Queue* queue) {
	return (queue->front == queue->rear);
}

int size(Queue* queue) {
	return (queue->rear - queue->front);
}

void enqueue(Queue* queue, int data) {
	queue->arr[queue->rear++] = data;
}

void dequeue(Queue* queue) {
	if (!isEmpty(queue)) queue->front++;
}

void print_queue(Queue* queue) {
	if (isEmpty(queue)) printf("empty");
	else {
		for (int i = queue->front; i < queue->rear; i++) {
			printf("%d ", queue->arr[i]);
		}
	}
}

int main() {
	int N;
	scanf("%d", &N);

	int data;
	Queue queue; init(&queue);
	while (1) {
		scanf("%d", &data);

		if (data == -1) break;
		else if (data == 0) dequeue(&queue);
		else if (size(&queue) < N) enqueue(&queue, data);
	}

	print_queue(&queue);
}