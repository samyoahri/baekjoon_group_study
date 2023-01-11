//c++ <stack> 이용해본거
#include <iostream>
#include <string.h>
#include <stack>
using namespace std;


int main() {
	int N ,X;
	stack<int> st;
	string s;
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> s;
		if (s == "push") {
			cin >> X;
			st.push(X);
			
		}
		else if (s == "pop") {
			if (!st.empty()){
				cout << st.top() << endl;
				st.pop();
			}
			else cout << -1 << endl;
		}
		else if (s == "size") {
			cout << st.size() << endl;
			
		}
		else if (s == "empty") {
			if (st.empty())
				cout << 1 << endl;
			else 
				cout << 0 << endl;
			
		}
		else if (s == "top") {
			if (st.empty())
				cout << -1 << endl;
			cout << st.top() << endl;
			
		}
		
	}
	return 0;
}
// 스택 구현한거

// #include <iostream>
// #include <string>

// using namespace std;
// struct stack {

// 	int arr[10001];
// 	int last;

// 	void init() {
// 		last = -1;
// 	}
// 	void push(int data) {
// 		arr[++last] = data;
// 	}
// 	bool empty() {
// 		return (last < 0);
// 	}
// 	int pop() {
// 		if (empty()) {
// 			return -1;
// 		}
// 		return arr[last--];
// 	}
// 	int size() {
// 		return last + 1;
// 	}
// 	int top() {
// 		if (empty()) {
// 			return -1;
// 		}
// 		return arr[last];
// 	}
// };

// int main() {
// 	int N ,X;
// 	stack st;
// 	st.init();
// 	string s;
// 	cin >> N;
// 	for (int i = 0; i < N; i++) {
// 		cin >> s;
// 		if (s == "push") {
// 			cin >> X;
// 			st.push(X);
// 		}
// 		else if (s == "pop") 
// 			cout << st.pop() << endl;
		
// 		else if (s == "size") 
// 			cout << st.size() << endl;
		
// 		else if (s == "empty") 
// 			cout << st.empty() << endl;
		
// 		else if (s == "top") 
// 			cout << st.top() << endl;
// 	}
// 	return 0;
// }