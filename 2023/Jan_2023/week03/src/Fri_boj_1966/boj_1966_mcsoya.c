#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct item {
	int data;		// 값
	int important;	// 중요도
}Item;

typedef struct queue{
	Item arr[100000];
	int front;
	int rear;
}Queue;

int isEmpty(Queue* queue) {
	return ((queue->rear - queue->front) == 0);
}

void init(Queue* queue) {
	queue->front = 0;
	queue->rear = 0;
}

void enqueue(Queue* queue, int data, int important) {
	Item item = { data, important };
	queue->arr[queue->rear++] = item;
}

Item dequeue(Queue* queue) {
	return queue->arr[queue->front++];
}

Item front(Queue* queue) {
	return queue->arr[queue->front];
}

int cmp(const void* a, const void* b) {
	int num1 = *(int *)a;
	int num2 = *(int *)b;
	if (num1 > num2) return -1;
	else if (num1 == num2) return 0;
	else return 1;
}

void print_queue(Queue* queue) {
	printf("< ");
	for (int i = queue->front; i < queue->rear; i++) {
		printf("%d(%d), ", queue->arr[i].data, queue->arr[i].important);
	}
	printf(">\n");
}

int main() {
	int Testcase;		// 테스트 케이스 개수
	int N, M;			// 문서의 개수, 위치
	int important[101] = {0};
	int import_pos = 0, j = 0;
	int tmp;

	scanf("%d", &Testcase);

	for (int i = 1; i <= Testcase; i++) {
		scanf("%d %d", &N, &M);

		Queue queue; init(&queue);
		import_pos = 0;

		for (int data = 1; data <= N; data++) {
			scanf("%d", &tmp);
			enqueue(&queue, data, tmp);
			important[import_pos++] = tmp;
		}

		qsort(important, import_pos, sizeof(int), cmp);

		j = 0;
		while(!isEmpty(&queue)) {
			Item item = dequeue(&queue);
			if ((important[j] == item.important)) {
				j++;
				if (item.data == M + 1) break;
			}
			enqueue(&queue, item.data, item.important);
		}
		printf("%d\n", j);
	}
}