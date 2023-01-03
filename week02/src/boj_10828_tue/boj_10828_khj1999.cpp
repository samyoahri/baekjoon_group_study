#include<iostream>
#include<string>
using namespace std;
const int MX = 10001;
int stack[MX];
int pos = 0;

void push(int n) {
	if (pos < MX) {
		stack[pos++] = n;
	}
}

void pop() {
	if (pos == 0) printf("-1\n");
	else printf("%d\n", stack[--pos]);
}

void size() {
	printf("%d\n", pos);
}

void empty() {
	int n;
	if (pos == 0) n = 1;
	else n = 0;
	printf("%d\n", n);
}

void top() {
	int n;
	if (pos == 0) n = -1;
	else n = stack[pos-1];
	printf("%d\n", n);
}

int main() {
	int n;
	scanf("%d", &n);
	while (n--) {
		string str;
		cin >> str;
		if (str == "push") {
			int num;
			cin >> num;
			push(num);
		}
		else if (str == "pop") pop();
		else if (str == "size") size();
		else if (str == "empty") empty();
		else if (str == "top") top();
	}
    return 0;
}