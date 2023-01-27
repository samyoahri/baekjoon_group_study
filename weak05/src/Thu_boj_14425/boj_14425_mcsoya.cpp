#include <iostream>
#include <map>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    
    int N, M;
    int result = 0;
    cin >> N >> M;
    
    map<string, int> maps;
    char str[501];
    for(int i = 1; i <= N; i++) {
        cin >> str;
        maps[str]++;
    }
    
    for(int j = 1; j <= M; j++) {
        cin >> str;
        if(maps[str] > 0) result++;
    }
    cout << result;
}