#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct queue {
	int arr[2000001];
	int front;
	int last;
}Queue;

void init(Queue* queue) {
	queue->front = 1;
	queue->last = 1;
}

int empty(Queue* queue) {
	if (queue->front == queue->last) return 1;
	else return 0;
}

void push(Queue* queue, int data) {
	queue->arr[queue->last++] = data;
}

int pop(Queue* queue) {
	if (empty(queue)) return -1;
	else return queue->arr[queue->front++];
}

int size(Queue* queue) {
	return (queue->last - queue->front);
}

int front(Queue* queue) {
	if (empty(queue)) return -1;
	else return queue->arr[queue->front];
}

int back(Queue* queue) {
	if (empty(queue)) return -1;
	else return queue->arr[queue->last - 1];
}

void solve(Queue* queue, char* str) {
	if (strcmp(str, "push") == 0) {
		int data; scanf("%d", &data);
		push(queue, data);
		getchar();
	}
	else if (strcmp(str, "pop") == 0) {
		printf("%d\n", pop(queue));
	}
	else if (strcmp(str, "size") == 0) {
		printf("%d\n", size(queue));
	}
	else if (strcmp(str, "empty") == 0) {
		printf("%d\n", empty(queue));
	}
	else if (strcmp(str, "front") == 0) {
		printf("%d\n", front(queue));
	}
	else if (strcmp(str, "back") == 0) {
		printf("%d\n", back(queue));
	}
}

int main() {
	int N;
	scanf("%d", &N);

	char str[10];

	Queue queue; init(&queue);
	getchar();
	for (int i = 0; i < N; i++) {
		scanf("%s", str);
		solve(&queue, str);
	}
}