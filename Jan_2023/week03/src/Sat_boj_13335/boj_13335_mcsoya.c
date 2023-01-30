#include <stdio.h>
#include <stdlib.h>

typedef struct truck {
	int weight;
	int position;
}Truck;

typedef struct queue {
	Truck arr[10000];
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

void enqueue(Queue* queue, int data, int pos) {
	Truck item = { data,pos };
	queue->arr[queue->rear++] = item;
}

void dequeue(Queue* queue) {
	if (!isEmpty(queue)) queue->arr[queue->front++];
}

Truck front(Queue* queue) {
	return queue->arr[queue->front];
}

int size(Queue* queue) {
	return (queue->rear - queue->front);
}


// -----------------------------------------------------------

int main() {
	int N, W, L;	// 트럭의 수, 다리의 길이, 최대하중
	scanf("%d %d %d", &N, &W, &L);

	int* input_data = (int*)calloc(N + 1, sizeof(int));
	for (int i = 1; i <= N; i++) scanf("%d", &input_data[i]);

	int result = 0, idx = 1, sum = 0;
	Queue line; init(&line);

	while ((idx <= N) || (!isEmpty(&line))) {
		// Move Position
		for (int i = line.front; i < line.rear; i++) line.arr[i].position--;
		
		if (!isEmpty(&line) && (front(&line).position == 0)) {
			sum -= front(&line).weight;
			dequeue(&line);
		}

		if ((idx <= N) && (sum + input_data[idx] <= L) && (size(&line) < W)) {
			enqueue(&line, input_data[idx], W);
			sum += input_data[idx++];
		}
		
		result++;
	}
	free(input_data);
	printf("%d", result);
}