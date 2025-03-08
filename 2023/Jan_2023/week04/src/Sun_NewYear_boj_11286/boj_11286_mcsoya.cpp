#include <iostream>

using namespace std;

typedef struct item {
	long long int data;	// 값
	int code;	// 음수 or 양수
}Item;

typedef struct priority_queue {
	Item heap[10001];
	int size;
}PriorityQueue;

void init(PriorityQueue* queue) {
	queue->size = 0;
}

Item createItem(long long int data) {
	Item item;
	item.data = (data > 0) ? data : -data;
	item.code = (data > 0) ? 1 : 0;
	return item;
}

void swap(Item* a, Item* b) {
	Item temp = *a;
	*a = *b;
	*b = temp;
}

void enqueue(PriorityQueue* queue, long long int data) {
	queue->heap[++queue->size] = createItem(data);

	int child = queue->size;
	int parent = child / 2;

	while ((child > 1) && (queue->heap[parent].data >= queue->heap[child].data)) {
		if (queue->heap[parent].data > queue->heap[child].data) {
			swap(queue->heap[parent], queue->heap[child]);
		}
		else if (queue->heap[parent].data == queue->heap[child].data) {
			if (queue->heap[parent].code > queue->heap[child].code) {
				swap(queue->heap[parent], queue->heap[child]);
			}
		}
		child = parent;
		parent /= 2;
	}
}

long long int dequeue(PriorityQueue* queue) {
	if (queue->size == 0) return 0;

	Item min = queue->heap[1];
	int parent = 1, child = 2;
	Item last = queue->heap[queue->size--];

	while (child <= queue->size) {
		if (queue->heap[child].data > queue->heap[child + 1].data) child++;
		else if ((queue->heap[child].data == queue->heap[child + 1].data)) {
			// 절대값이 같을 경우, 더 작은 값을 선택한다.
			if ((queue->heap[child].code > queue->heap[child + 1].code)) child++;
		}

		if (last.data < queue->heap[child].data) break;
		else if (last.data == queue->heap[child].data) {
			if (last.code < queue->heap[child].code) break;
		}

		queue->heap[parent] = queue->heap[child];
		parent = child;
		child *= 2;
	}
	queue->heap[parent] = last;
	return (min.code) ? min.data : -min.data;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N;
	long long int data;
	PriorityQueue queue; init(&queue);

	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> data;

		if (data == 0) cout << dequeue(&queue) << "\n";
		else enqueue(&queue, data);
	}
}