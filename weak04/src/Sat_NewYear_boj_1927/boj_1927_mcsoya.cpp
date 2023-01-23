#include <iostream>
#include <cstdlib>

using namespace std;

#define HEAP_SIZE 100001

typedef struct priority_queue {
	long long int heap[HEAP_SIZE];
	int size;
}Priority_queue;

void init(Priority_queue* queue) {
	queue->size = 0;
}

void swap(int* a, int* b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}

void enqueue(Priority_queue* queue, long long int data) {
	queue->heap[++queue->size] = data;
	int child = queue->size;
	int parent = child / 2;

	while ((parent >= 1) && (queue->heap[parent] > queue->heap[child])) {
		swap(queue->heap[parent], queue->heap[child]);
		child = parent;
		parent /= 2;
	}
}

long long int dequeue(Priority_queue* queue) {
	if (queue->size == 0) return 0;

	int parent = 1, child = 2;
	long long int min_item = queue->heap[1];
	long long int last_item = queue->heap[queue->size--];

	while ((child <= queue->size)) {
		if ((child < queue->size) && (queue->heap[child] > queue->heap[child + 1])) child++;
		if (last_item <= queue->heap[child]) break;

		queue->heap[parent] = queue->heap[child];
		parent = child;
		child *= 2;
	}
	queue->heap[parent] = last_item;
	return min_item;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N;
	cin >> N;

	Priority_queue queue; init(&queue);
	long long int data;
	for (int i = 1; i <= N; i++) {
		cin >> data;
		if (data) enqueue(&queue, data);
		else cout << dequeue(&queue) << "\n";
	}
}