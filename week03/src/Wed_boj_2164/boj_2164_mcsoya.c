#include <stdio.h>
#include <stdlib.h>

typedef struct item {
	int data;
	struct item* link;
}Item;

typedef struct queue {
	Item* front;
	Item* rear;
	int size;
}Queue;

void init(Queue* queue) {
	queue->front = NULL;
	queue->rear = NULL;
	queue->size = 0;
}

int isEmpty(Queue* queue) {
	if (queue->size == 0) return 1;
	else return 0;
}

Item* create_Item(int data) {
	Item* item = (Item*)calloc(1, sizeof(Item));
	item->data = data; item->link = NULL;
	return item;
}

void push(Queue* queue, int data) {
	Item* item = create_Item(data);
	
	if (queue->size == 0) queue->front = item;
	else queue->rear->link = item;

	queue->rear = item;
	queue->size++;
}

int pop(Queue* queue) {
	if (!isEmpty(queue)) {
		int result = queue->front->data;

		Item* delete_item = queue->front;
		queue->front = delete_item->link;
		free(delete_item);

		queue->size--;
		return result;
	}
	else return -1;
}

int main() {
	int N; scanf("%d", &N);

	Queue queue; init(&queue);

	for (int i = 1; i <= N; i++) push(&queue, i);
	
	while (queue.size > 1) {
        pop(&queue);
		push(&queue, pop(&queue));
	}
	printf("%d", queue.front->data);	
}