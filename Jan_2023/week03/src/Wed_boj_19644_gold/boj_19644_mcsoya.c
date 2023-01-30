#include <stdio.h>

/*
반례)
- 폭탄을 사용한다면, 기관총은 사용할 수 없다. (반례 1)
- 폭탄이 연속으로 터진다면? (반례 2)
*/

typedef struct queue {
	int arr[3000001];
	int front;
	int rear;
}Queue;

void init(Queue* queue) {
	queue->front = 1;
	queue->rear = 1;
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

int front(Queue* queue) {
	if (!isEmpty(queue)) return queue->arr[queue->front];
	else return -1;
}

int main() {
	int L;	// 진지 앞쪽 길의 거리
	int Range, Damage;	// 유효 사거리 , 공격력
	int Ammo;		// 지뢰 갯수(즉사)
	int Zombie;		// 좀비 체력
	Queue queue; init(&queue);
	Queue bomber_queue; init(&bomber_queue);

	scanf("%d", &L);
	scanf("%d %d", &Range, &Damage);
	scanf("%d", &Ammo);

	int isbomb = 1;
	for (int i = 1; i <= L; i++) {
		scanf("%d", &Zombie);
		enqueue(&queue, Zombie);
		
		long long attack = attack = Damage * ((i < Range) ? i : Range);
		attack -= size(&bomber_queue) * Damage;

		if(Zombie - attack > 0) {
			if (Ammo && isbomb) {
				dequeue(&queue);
				Ammo -= isbomb--;
				enqueue(&bomber_queue, i + Range - 1);
			} 
			else {
				break;
			}
		}
		else {
			dequeue(&queue);
		}

		isbomb = 1;
		if (front(&bomber_queue) == i) dequeue(&bomber_queue);
	}

	// 결과 출력
	printf(isEmpty(&queue) ? "YES" : "NO");
}