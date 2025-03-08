#include <iostream>
#include <queue>

using namespace std;

int find_winner(deque<int> ground[]) {
	if (!ground[0].empty() && !ground[1].empty() && (ground[0].back() + ground[1].back() == 5)) return 1;
	else if ((!ground[0].empty() && ground[0].back() == 5) || (!ground[1].empty() && ground[1].back() == 5)) return 0;
	else return -1;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	int N, M;
	cin >> N >> M;

	deque<int> deck[2], ground[2];

	int a, b;
	for (int i = 1; i <= N; i++) {
		cin >> a >> b;
		deck[0].push_back(a);	deck[1].push_back(b);
	}

	for (int i = 1, turn = 0; i <= M; i++, turn = !turn) {
		ground[turn].push_back(deck[turn].back());
		deck[turn].pop_back();
		if (deck[turn].empty()) break;

		int res = find_winner(ground);
		if (res >= 0) {
			int other = !res;
			while (!ground[other].empty()) {
				deck[res].push_front(ground[other].front());
				ground[other].pop_front();
			}

			while (!ground[res].empty()) {
				deck[res].push_front(ground[res].front());
				ground[res].pop_front();
			}
		}
	}

	if (deck[0].size() > deck[1].size()) cout << "do";
	else if (deck[0].size() < deck[1].size()) cout << "su";
	else cout << "dosu";
}