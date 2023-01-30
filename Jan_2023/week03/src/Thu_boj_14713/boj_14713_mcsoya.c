#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct queue {
	char arr[101][40];
	int front;
	int rear;
}Queue;

void init(Queue* queue) {
	queue->front = 1;
	queue->rear = 1;
}

void enqueue(Queue* queue, char* str) {
	strcpy(queue->arr[queue->rear++], str);
}

char* dequeue(Queue* queue) {
	return queue->arr[queue->front++];
}

int isEmpty(Queue* queue) {
	return (queue->front == queue->rear);
}

int size(Queue* queue) {
	return (queue->rear - queue->front);
}

char* front(Queue* queue) {
	return queue->arr[queue->front];
}

void make_queue(Queue* queue, char* str, int i) {
	init(&queue[i]);
	char* ptr = strtok(str, " ");
	while (ptr != NULL) {
		enqueue(&queue[i], ptr);
		ptr = strtok(NULL, " ");
	}
}

// ---------------------------------------------------------------

int main() {
    // Input
	int N; scanf("%d", &N);
	Queue* queueA = (Queue*)calloc(N + 1, sizeof(Queue));
	int counter = 0;

	// Line : 0 ~ (N + 1) 입력
	char str[10000]; getchar();
	for (int i = 1; i <= N; i++) {
		gets(str);
		make_queue(queueA, str, i);
		counter += size(&queueA[i]);
	}

	// Line : (N + 2) 입력
	char res[1000000]; gets(res);
	char* ptr = strtok(res, " ");

    // Line: Final Checking
	while (ptr != NULL) {
		int i;
		for (i = 1; i <= N; i++) {
			if (!isEmpty(&queueA[i])) {
				if (strcmp(ptr, front(&queueA[i])) == 0) {
					counter--;
					dequeue(&queueA[i]);
					break;
				}
			}
		}
		if (i > N) break;
		ptr = strtok(NULL, " ");
	}

	// Line: Result
	if ((ptr == NULL) && (counter == 0)) printf("Possible");
	else printf("Impossible");

	free(queueA);
}