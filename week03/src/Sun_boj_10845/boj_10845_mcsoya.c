#include <stdio.h>
#include <string.h>

typedef struct queue {
    int arr[100000];
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

void enqueue(Queue* queue, int data) {
    queue->arr[queue->rear++] = data;
}

int dequeue(Queue* queue) {
    if(!isEmpty(queue)) return queue->arr[queue->front++];
    else return -1;
}

int size(Queue* queue) {
    return queue->rear - queue->front;
}

int front(Queue* queue) {
    if(!isEmpty(queue)) return queue->arr[queue->front];
    else return -1;
}

int back(Queue* queue) {
    if(!isEmpty(queue)) return queue->arr[queue->rear - 1];
    else return -1;
}

void solve(Queue* queue, char str[]) {
    if(strcmp(str, "push") == 0) {
        int tmp; scanf("%d", &tmp);
        enqueue(queue, tmp);
    } else if(strcmp(str, "pop") == 0) {
        printf("%d\n", dequeue(queue));
    } else if(strcmp(str, "size") == 0) {
        printf("%d\n", size(queue));
    } else if(strcmp(str, "empty") == 0) {
        printf("%d\n", isEmpty(queue));
    } else if(strcmp(str, "front") == 0) {
        printf("%d\n", front(queue));
    } else if(strcmp(str, "back") == 0) {
        printf("%d\n", back(queue));
    }
    
}

int main() {
    int N;
    scanf("%d", &N);
    
    char str[10];
    int data;
    Queue queue; init(&queue);
    for(int i = 1; i <= N; i++) {
        scanf("%s", str);
        solve(&queue, str);
    }
}